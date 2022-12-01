package com.zjut.auditservice.service.impl;

import com.zjut.auditservice.pojo.Customer;
import com.zjut.auditservice.mapper.CustomerMapper1;
import com.zjut.auditservice.service.CustomerService1;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@Service
public class CustomerServiceImpl1 extends ServiceImpl<CustomerMapper1, Customer> implements CustomerService1 {

}
