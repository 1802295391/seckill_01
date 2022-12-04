package com.zjut.manageservice.mapper;

import com.zjut.manageservice.pojo.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    Integer selectRefundCount(@Param("day") String day);

    Integer selectClinchCount(@Param("day") String day);
}
