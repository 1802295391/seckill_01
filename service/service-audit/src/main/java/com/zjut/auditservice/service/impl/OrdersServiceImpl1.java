package com.zjut.auditservice.service.impl;

import com.zjut.auditservice.pojo.Orders;
import com.zjut.auditservice.mapper.OrdersMapper1;
import com.zjut.auditservice.service.OrdersService1;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@Service
public class OrdersServiceImpl1 extends ServiceImpl<OrdersMapper1, Orders> implements OrdersService1 {

}
