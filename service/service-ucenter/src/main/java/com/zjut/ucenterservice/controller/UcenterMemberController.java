package com.zjut.ucenterservice.controller;


import com.zjut.baseservice.exceptionhandler.GuliException;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import com.zjut.ucenterservice.pojo.vo.LoginInfoVo;
import com.zjut.ucenterservice.pojo.vo.LoginVo;
import com.zjut.ucenterservice.pojo.vo.RegisterVo;
import com.zjut.ucenterservice.service.UcenterMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-11-26
 */
@RestController
@RequestMapping("/ucenterservice/apimember")
@CrossOrigin
public class UcenterMemberController {
    @Autowired
    private UcenterMemberService memberService;
    @ApiOperation(value = "会员登录")
    @PostMapping("login")
    public R login(@RequestBody LoginVo loginVo) {
        String token = memberService.login(loginVo);
        return R.ok().data("token", token);
    }
    @ApiOperation(value = "会员注册")
    @PostMapping("register")
    public R register(@RequestBody RegisterVo registerVo){
         boolean register = memberService.register(registerVo);
         if(register)
        return R.ok().data("bool","成功");
         else
         {
             return R.error().message("注册失败").data("bool","失败");
         }
    }
    @ApiOperation(value = "根据token获取登录信息")
    @GetMapping("auth/getLoginInfo")
    public R getLoginInfo(HttpServletRequest request){
        try {
            String memberId = JwtUtils.getMemberIdByJwtToken(request);
            LoginInfoVo loginInfoVo = memberService.getLoginInfo(memberId);
            return R.ok().data("item", loginInfoVo);
        }catch (Exception e){
            e.printStackTrace();
            throw new GuliException(20001,"error");
        }
    }
}
