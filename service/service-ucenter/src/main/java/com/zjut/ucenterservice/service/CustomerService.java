package com.zjut.ucenterservice.service;

import com.zjut.ucenterservice.pojo.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.ucenterservice.pojo.vo.LoginInfoVo;
import com.zjut.ucenterservice.pojo.vo.LoginVo;
import com.zjut.ucenterservice.pojo.vo.RegisterVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
public interface CustomerService extends IService<Customer> {

    String login(LoginVo loginVo);

    boolean register(RegisterVo registerVo);

    LoginInfoVo getLoginInfo(String memberId);

    Customer getByOpenid(String openid);
}
