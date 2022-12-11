package com.zjut.bookservice.service.impl;

import com.zjut.bookservice.pojo.Customer;
import com.zjut.bookservice.mapper.CustomerMapper;
import com.zjut.bookservice.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
