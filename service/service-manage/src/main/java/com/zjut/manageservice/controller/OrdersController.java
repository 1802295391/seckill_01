package com.zjut.manageservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Orders;

import com.zjut.manageservice.pojo.vo.OrdersQuery;

import com.zjut.manageservice.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Api(description="订单管理")
@CrossOrigin
@RestController
@RequestMapping("/manageservice/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @ApiOperation(value = "分页订单列表")
    @PostMapping("{page}/{limit}")
    public R pageQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "OrdersQuery", value = "查询对象", required = false)
            @RequestBody(required = false) OrdersQuery OrdersQuery) {
        Page<Orders> pageParam = new Page<>(page, limit);
        ordersService.pageQuery(pageParam, OrdersQuery);

        List<Orders> records = pageParam.getRecords();

        long total = pageParam.getTotal();
        return R.ok().data("total", total).data("rows",  records);
    }






    @PostMapping("excel")
    @ApiOperation(value = "打印订单列表")
    public R exlist(@ApiParam(name = "Orders", value = "查询对象", required = false)
                    @RequestBody(required = false) OrdersQuery ordersQuery) {

        List<Orders> list = ordersService.idasclist(ordersQuery);
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        //String s = Integer.toString(sun++);
        String fileName = "D:\\"+uuid+".xlsx";
        EasyExcel.write(fileName, Orders.class).sheet("订单列表").doWrite(list);
        return R.ok().data("address",fileName);
    }
}

