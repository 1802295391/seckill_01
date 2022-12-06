package com.zjut.orderservice.service;

import com.zjut.orderservice.pojo.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
public interface OrdersService extends IService<Orders> {

    String saveOrder(String courseId, String memberIdByJwtToken,Integer userNum);
}
