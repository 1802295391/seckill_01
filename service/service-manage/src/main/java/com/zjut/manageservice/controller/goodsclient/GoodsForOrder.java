package com.zjut.manageservice.controller.goodsclient;

import com.zjut.commonutils.dto.GoodsOrderDto;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Goods;


import com.zjut.manageservice.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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


    @PostMapping("update")
    public void updateById(
            @ApiParam(name = "goodsy", value = "商品对象", required = true)
            @RequestBody Goods goodsy){
        goodsService.updateById(goodsy);

    }


    @GetMapping("{id}")
    public Goods getById(
            @ApiParam(name = "id", value = "商品ID", required = true)
            @PathVariable String id){

        return goodsService.getById(id);
    }



}
