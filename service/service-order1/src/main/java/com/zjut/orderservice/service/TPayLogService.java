package com.zjut.orderservice.service;

import com.zjut.orderservice.pojo.TPayLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 支付日志表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
public interface TPayLogService extends IService<TPayLog> {

    Map createNative(String orderNum);

    Map<String, String> queryPayStatus(String orderNo);

    void updateOrderStatus(Map<String, String> map);
}
