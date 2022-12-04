package com.zjut.staservice.client;

import com.zjut.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("service-manage")
public interface CustomerClient {



    @GetMapping(value = "/manageservice/customer/countregister/{day}")
    public R registerCount(@PathVariable("day") String day);

    @GetMapping(value = "/manageservice/orders/countclinch/{day}")
    public R clinchCount(@PathVariable("day") String day);

    @GetMapping(value = "/manageservice/orders/countrefund/{day}")
    public R refundCount(@PathVariable("day") String day);
}
