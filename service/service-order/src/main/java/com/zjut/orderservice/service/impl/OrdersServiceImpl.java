package com.zjut.orderservice.service.impl;

import com.zjut.commonutils.dto.CustomerDto;
import com.zjut.commonutils.dto.GoodsOrderDto;
import com.zjut.orderservice.client.OrderClient;
import com.zjut.orderservice.pojo.Orders;
import com.zjut.orderservice.mapper.OrdersMapper;
import com.zjut.orderservice.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjut.orderservice.utils.OrderNoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private OrderClient orderClient;
    @Override
    public String saveOrder(String courseId, String memberIdByJwtToken) {
         GoodsOrderDto orderGoods = orderClient.getOrderGoods(courseId);
       CustomerDto orderUser = orderClient.getOrderUser(memberIdByJwtToken);
       if(orderGoods.getLevel()>orderUser.getLevel())
       {
           return "您等级不够";
       }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String newDate = sdf.format(new Date());
        Date startTime = orderGoods.getStartTime();
        System.out.println("====================="+orderGoods.getStartTime());
        String time=sdf.format(startTime);
        if(time.compareTo(newDate)>0 ) {
            return "秒杀未开始";
        }
        Orders orders = new Orders();
        orders.setDetailImage(orderGoods.getDetailImage());
        orders.setUserId(orderUser.getId());
        orders.setUsername(orderUser.getUsername());
        orders.setGoodsId(orderGoods.getId());
        orders.setTitle(orderGoods.getTitle());
        orders.setPhone(orderUser.getPhone());
        orders.setTotalPrice(orderGoods.getPrice());
        orders.setGoodsNum(1);
        orders.setState(0);
        orders.setOrdersNum(OrderNoUtil.getOrderNo());
            baseMapper.insert(orders);
        return orders.getOrdersNum();
    }
}
