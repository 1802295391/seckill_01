package com.zjut.orderservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import com.zjut.orderservice.pojo.Orders;
import com.zjut.orderservice.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@RestController
@RequestMapping("/orderservice/order")
@CrossOrigin
public class OrdersController {
    @Autowired
    private OrdersService orderService;
    //根据课程id和用户id创建订单，返回订单id
    @PostMapping("createOrder/{courseId}")
    public R createOrder(@PathVariable String courseId, HttpServletRequest request) {
        String orderNum = orderService.saveOrder(courseId, JwtUtils.getMemberIdByJwtToken(request));
        return R.ok().data("orderNum", orderNum);
    }

    @GetMapping("getOrder/{orderNum}")
    public R get(@PathVariable String orderNum) {
        QueryWrapper<Orders> wrapper = new QueryWrapper<>();
        wrapper.eq("orders_num",orderNum);
        Orders order = orderService.getOne(wrapper);
        return R.ok().data("item", order);
    }
}

