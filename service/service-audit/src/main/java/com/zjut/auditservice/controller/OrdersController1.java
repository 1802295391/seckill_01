package com.zjut.auditservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.auditservice.pojo.Orders;
import com.zjut.auditservice.pojo.vo.OrdersQuery;
import com.zjut.auditservice.service.OrdersService1;
import com.zjut.commonutils.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@RestController
@CrossOrigin
@RequestMapping("/auditservice/orders")
public class OrdersController1 {

    @Autowired
    private OrdersService1 ordersService;

    @ApiOperation(value = "订单分页查询条件")
    @PostMapping("{page}/{limit}")
    public R pageQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "OrdersQuery", value = "查询对象", required = false)
            @RequestBody(required = false) OrdersQuery OrdersQuery) {

        Page<Orders> pageParam = new Page<>(page, limit);
        QueryWrapper<Orders> wrapper = new QueryWrapper<>();
        //查询状态为2 退款中的订单
        wrapper.eq("state", "2");
        ordersService.page(pageParam,wrapper);

        List<Orders> records = pageParam.getRecords();

        long total = pageParam.getTotal();

        return R.ok().data("total", total).data("rows",  records);
    }
    @DeleteMapping("{id}")
    public R removeOrderByID(@PathVariable String id){
        boolean flag = ordersService.removeById(id);
        return (flag ?R.ok():R.error());
    }
}

