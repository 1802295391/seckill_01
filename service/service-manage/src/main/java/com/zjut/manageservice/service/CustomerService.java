package com.zjut.manageservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.manageservice.pojo.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.manageservice.pojo.vo.CustomerQuery;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
public interface CustomerService extends IService<Customer> {

    List<Customer> idasclist(CustomerQuery customerQuery) ;


    void pageQuery(Page<Customer> pageParam, CustomerQuery customerQuery);

    Integer countRegisterByDay(String day);


}
