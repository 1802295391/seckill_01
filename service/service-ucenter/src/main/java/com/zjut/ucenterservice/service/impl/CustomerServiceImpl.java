package com.zjut.ucenterservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.baseservice.exceptionhandler.GuliException;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.MD5;
import com.zjut.ucenterservice.pojo.Customer;
import com.zjut.ucenterservice.mapper.CustomerMapper;

import com.zjut.ucenterservice.pojo.vo.LoginInfoVo;
import com.zjut.ucenterservice.pojo.vo.LoginVo;
import com.zjut.ucenterservice.pojo.vo.RegisterVo;
import com.zjut.ucenterservice.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    /**
     * 会员登录
     * @param loginVo
     * @return
     */
    @Override
    public String login(LoginVo loginVo) {
        String phone = loginVo.getPhone();
        String password = loginVo.getPassword();
//校验参数
        System.out.println(phone);
        System.out.println(password);
        if(StringUtils.isEmpty(phone) ||
                StringUtils.isEmpty(password)
               ) {
            throw new GuliException(20001,"error");
        }
//获取会员
        Customer member = baseMapper.selectOne(new QueryWrapper<Customer>().eq("phone", phone));
        if(null == member) {
            throw new GuliException(20001," ");
        }
//校验密码
        if(!MD5.encrypt(password).equals(member.getPassword())) {
            throw new GuliException(20001,"error");
        }
//校验是否被禁用
        if(member.getIsDisabled()) {
            throw new GuliException(20001,"error");
        }
//使用JWT生成token字符串
        String token = JwtUtils.getJwtToken(member.getId(), member.getUsername());
        return token;
    }









    /**
     * 会员注册
     * @param registerVo
     */
    @Override
    public boolean register(RegisterVo registerVo) {
//获取注册信息，进行校验
        String username = registerVo.getUsername();
        String phone = registerVo.getPhone();
        String password = registerVo.getPassword();
        String code = registerVo.getCode();
//校验参数
        if(StringUtils.isEmpty(phone) ||
                StringUtils.isEmpty(password) ||
                StringUtils.isEmpty(code)) {
            System.out.println("校验参数");
            return false;
        }
//校验校验验证码
//从redis获取发送的验证码
        String mobleCode = redisTemplate.opsForValue().get(phone);
        System.out.println(phone);
        System.out.println(mobleCode);
        if(!code.equals(mobleCode)) {
            System.out.println("校验校验验证码");
            return false;
        }
//查询数据库中是否存在相同的手机号码
        Integer count = baseMapper.selectCount(new QueryWrapper<Customer>().eq("phone", phone));
        if(count > 0) {
            System.out.println("查询数据库中是否存在相同的手机号码");
            return false;
        }
//添加注册信息到数据库
        Customer member = new Customer();
        member.setUsername(username);
        member.setPhone(registerVo.getPhone());
        member.setPassword(MD5.encrypt(password));
        member.setIsDisabled(false);
        member.setAvatar("http://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eoj0hHXhgJNOTSOFsS4uZs8x1ConecaVOB8eIl115xmJZcT4oCicvia7wMEufibKtTLqiaJeanU2Lpg3w/132");
        this.save(member);
        return true;
    }




    @Override
    public LoginInfoVo getLoginInfo(String memberId) {
        Customer member = baseMapper.selectById(memberId);
        LoginInfoVo loginInfoVo = new LoginInfoVo();
        BeanUtils.copyProperties(member, loginInfoVo);
        return loginInfoVo;
    }


    @Override
    public Customer getByOpenid(String openid) {
        QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("openid", openid);
        Customer member = baseMapper.selectOne(queryWrapper);
        return member;
    }
}
