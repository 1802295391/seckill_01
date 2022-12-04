package com.zjut.manageservice.controller.userclient;

import com.zjut.commonutils.R;
import com.zjut.manageservice.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description="开放统计调用")
@CrossOrigin
@RestController
@RequestMapping("/manageservice/customer")
public class CustomerForStatistics {
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "countregister/{day}")
    public R registerCount(@PathVariable String day){
        Integer count = customerService.countRegisterByDay(day);
        return R.ok().data("countRegister", count);
    }



}
