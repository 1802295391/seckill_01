package com.zjut.auditservice.controller;

import com.zjut.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auditservice/user")
@CrossOrigin  //解决跨域
public class login {
    //登录接口
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    //获取用户登录信息
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[超级审核员]")
                .data("name","admin")
                .data("avatar","https://tupian.qqw21.com/article/UploadPic/2018-4/201841922423846502.jpg");
    }
}
