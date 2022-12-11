package com.zjut.orderservice.client;

import com.zjut.commonutils.R;
import com.zjut.commonutils.dto.CustomerDto;
import com.zjut.commonutils.dto.Goods;
import com.zjut.commonutils.dto.GoodsOrderDto;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("service-manage")
public interface OrderClient {


    @GetMapping(value = "/manageservice/goods-order/getDto/{goodsId}")
    public GoodsOrderDto getOrderGoods(@PathVariable("goodsId") String goodsId);


    @GetMapping(value = "/manageservice/customer/getDto/{customerId}")
    public CustomerDto getOrderUser(@PathVariable("customerId") String customerId);


    @PostMapping("/manageservice/goods-order/update")
    public void updateById(
            @ApiParam(name = "goodsy", value = "商品对象", required = true)
            @RequestBody Goods goodsy);

    @GetMapping("/manageservice/goods-order/{id}")
    public Goods getById(
            @ApiParam(name = "id", value = "商品ID", required = true)
            @PathVariable("id") String id);
}
