package com.zjut.manageservice.controller;


import com.zjut.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manageservice/user")
@CrossOrigin  //解决跨域
public class ManageLogin {
    @PostMapping("login")
    public R login(){

        return R.ok().data("token","admin");
    }

    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[管理员]")
                .data("name","admin")
                .data("avatar","https://tupian.qqw21.com/article/UploadPic/2018-4/201841922423846502.jpg");
    }
}
