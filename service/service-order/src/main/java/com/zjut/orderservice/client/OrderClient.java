package com.zjut.orderservice.client;

import com.zjut.commonutils.dto.CustomerDto;
import com.zjut.commonutils.dto.GoodsOrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@FeignClient("service-manage")
public interface OrderClient {


    @GetMapping(value = "/manageservice/goods-order/getDto/{goodsId}")
    public GoodsOrderDto getOrderGoods(@PathVariable("goodsId") String goodsId);
    @GetMapping(value = "/manageservice/customer/getDto/{customerId}")
    public CustomerDto getOrderUser(@PathVariable("customerId") String customerId);
}
