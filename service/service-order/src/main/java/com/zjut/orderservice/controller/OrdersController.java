package com.zjut.orderservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import com.zjut.orderservice.pojo.Orders;
import com.zjut.orderservice.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

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
    @PostMapping("createOrder/{courseId}/{userNum}")
    public R createOrder(@PathVariable("courseId") String courseId, @PathVariable("userNum") Integer userNum,HttpServletRequest request) {
        String userId=JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("+++++++++++++++"+userNum);
        if(userId=="请先登录")
        {
            return R.error().message("请先登录");
        }
        String orderNum = orderService.saveOrder(courseId, userId,userNum);
        if(orderNum.equals( "您等级不够"))
        {
            return R.error().message("您等级太低了");
        }
        if(orderNum.equals( "秒杀未开始"))
        {
            return R.error().message("秒杀未开始");
        }
        if(orderNum.equals("库存不足"))
        {
            return R.error().message("库存不足");
        }
        if(orderNum.equals("别捣乱"))
        {
            return R.error().message("商品不能买负数");
        }
        if(orderNum.equals("超过购买限制"))
        {
            return R.error().message("超过购买限制");
        }
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

