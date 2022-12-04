package com.zjut.manageservice.controller.goodsclient;

import com.zjut.commonutils.dto.GoodsOrderDto;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Goods;


import com.zjut.manageservice.service.GoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description="开放给订单")
@CrossOrigin
@RestController
@RequestMapping("/manageservice/goods-order")
public class GoodsForOrder {
    @Autowired
    private GoodsService goodsService;
    @GetMapping(value = "getDto/{goodsId}")
    public GoodsOrderDto getOrderGoods(@PathVariable String goodsId){
       Goods goods = goodsService.getById(goodsId);
         GoodsOrderDto goodsOrderDto = new GoodsOrderDto();
        BeanUtils.copyProperties(goods,goodsOrderDto);
        return goodsOrderDto;
    }



}
