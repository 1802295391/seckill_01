package com.zjut.manageservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.manageservice.pojo.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.manageservice.pojo.vo.OrdersQuery;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
public interface OrdersService extends IService<Orders> {

    void pageQuery(Page<Orders> pageParam, OrdersQuery ordersQuery);

    List<Orders> idasclist(OrdersQuery orders);

    void pageHistoryQuery(Page<Orders> pageParam, OrdersQuery ordersQuery);
}
