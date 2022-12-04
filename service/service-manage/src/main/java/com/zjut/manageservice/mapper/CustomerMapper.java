package com.zjut.manageservice.mapper;

import com.zjut.manageservice.pojo.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
public interface CustomerMapper extends BaseMapper<Customer> {

    Integer selectRegisterCount(@Param("day") String day);


}
