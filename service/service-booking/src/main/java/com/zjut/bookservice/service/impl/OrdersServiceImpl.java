package com.zjut.bookservice.service.impl;

import com.zjut.bookservice.pojo.Orders;
import com.zjut.bookservice.mapper.OrdersMapper;
import com.zjut.bookservice.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
