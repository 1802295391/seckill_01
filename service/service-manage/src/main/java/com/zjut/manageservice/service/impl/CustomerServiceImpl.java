package com.zjut.manageservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.manageservice.pojo.Customer;
import com.zjut.manageservice.mapper.CustomerMapper;
import com.zjut.manageservice.pojo.vo.CustomerQuery;
import com.zjut.manageservice.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
    @Override
    public List<Customer> idasclist(CustomerQuery customerQuery) {
        QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (customerQuery == null) {
            List<Customer> list = this.list(queryWrapper);
            return list;
        }
        String name = customerQuery.getUsername();
        Integer level = customerQuery.getLevel();
        String begin = customerQuery.getBegin();
        Integer sex = customerQuery.getSex();
        Integer isDisabled=customerQuery.getIsDisabled();
        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("name", name);
        }
        if (!StringUtils.isEmpty(level)) {
            queryWrapper.eq("level", level);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("gmt_create", begin);
        }
        if (!StringUtils.isEmpty(sex)) {
            queryWrapper.eq("sex", sex);
        }
        if (!StringUtils.isEmpty(isDisabled)) {
            queryWrapper.like("is_Disabled", isDisabled);
        }

        List<Customer> list = this.list(queryWrapper);
        return list;
    }

    @Override
    public void pageQuery(Page<Customer> pageParam, CustomerQuery customerQuery) {
       
            QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByDesc("gmt_create");
            if (customerQuery == null) {
                baseMapper.selectPage(pageParam, queryWrapper);
                return;
            }
            String name = customerQuery.getUsername();
            Integer level = customerQuery.getLevel();
        Integer sex = customerQuery.getSex();
            String begin = customerQuery.getBegin();
            Integer isDisabled=customerQuery.getIsDisabled();
            if (!StringUtils.isEmpty(name)) {
                queryWrapper.like("username", name);
            }
            if (!StringUtils.isEmpty(level)) {
                queryWrapper.eq("level", level);
            }
            if (!StringUtils.isEmpty(sex)) {
            queryWrapper.eq("sex", sex);
        }
            if (!StringUtils.isEmpty(begin)) {
                queryWrapper.ge("gmt_create", begin);
            }
        if (!StringUtils.isEmpty(isDisabled)) {
            queryWrapper.like("is_Disabled", isDisabled);
        }

            baseMapper.selectPage(pageParam, queryWrapper);
        }

    }
