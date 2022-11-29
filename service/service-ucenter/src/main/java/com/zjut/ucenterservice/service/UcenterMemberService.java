package com.zjut.ucenterservice.service;

import com.zjut.ucenterservice.pojo.UcenterMember;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.ucenterservice.pojo.vo.LoginInfoVo;
import com.zjut.ucenterservice.pojo.vo.LoginVo;
import com.zjut.ucenterservice.pojo.vo.RegisterVo;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-26
 */
public interface UcenterMemberService extends IService<UcenterMember> {

    String login(LoginVo loginVo);

    boolean register(RegisterVo registerVo);

    LoginInfoVo getLoginInfo(String memberId);

    UcenterMember getByOpenid(String openid);
}
