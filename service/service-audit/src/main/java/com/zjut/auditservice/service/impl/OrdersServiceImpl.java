package com.zjut.auditservice.service.impl;

import com.zjut.auditservice.pojo.Orders;
import com.zjut.auditservice.mapper.OrdersMapper;
import com.zjut.auditservice.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
