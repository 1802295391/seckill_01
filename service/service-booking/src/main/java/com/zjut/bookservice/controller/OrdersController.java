package com.zjut.bookservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.bookservice.pojo.Orders;
import com.zjut.bookservice.service.OrdersService;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@RestController
@RequestMapping("/bookservice/orders")
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
     /*  String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        if(token=="请先登录"){
            return R.error().message("你还未登录，请先登录");
        }*/

    //查询未支付订单0.

    @GetMapping ("myOrder")
    public R myOrder(HttpServletRequest request){
        String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        if(token=="请先登录"){
            return R.error().message("你还未登录，请先登录");
        }
        //String token="1596558950512316414";
        QueryWrapper <Orders> wrapper=new QueryWrapper<>();
        wrapper.eq("user_id",token);
        wrapper.eq("state",0);
        List<Orders> ordersList = ordersService.list(wrapper);
        System.out.println(ordersList.size());
        System.out.println(ordersList);
        return R.ok().data("ordersList",ordersList);
    }

    //查看已付订单
    @GetMapping ("myOrdered")
    public R myOrdered(HttpServletRequest request){
        String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        if(token=="请先登录"){
            return R.error().message("你还未登录，请先登录");
        }
        //String token="1596558950512316414";
        QueryWrapper <Orders> wrapper=new QueryWrapper<>();
        wrapper.eq("user_id",token);
        wrapper.eq("state",1);
        List<Orders> ordersList = ordersService.list(wrapper);
        System.out.println(ordersList.size());
        System.out.println(ordersList);
        return R.ok().data("ordersList",ordersList);
    }

}

