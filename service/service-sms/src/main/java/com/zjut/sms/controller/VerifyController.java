package com.zjut.sms.controller;

import com.zjut.commonutils.R;

import com.zjut.sms.service.VerifyService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/eduverify")
@CrossOrigin //跨域
public class VerifyController{
    @Autowired
    private VerifyService verifyService;

    @PostMapping(value = "contrast")
    public R code() {


      return R.ok();

    }
}