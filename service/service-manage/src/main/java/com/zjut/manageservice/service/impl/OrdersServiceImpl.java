package com.zjut.manageservice.service.impl;

import com.zjut.manageservice.pojo.Orders;
import com.zjut.manageservice.mapper.OrdersMapper;
import com.zjut.manageservice.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
