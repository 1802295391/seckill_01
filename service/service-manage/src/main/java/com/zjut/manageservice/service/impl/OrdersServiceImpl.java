package com.zjut.manageservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.manageservice.pojo.Orders;
import com.zjut.manageservice.pojo.Orders;
import com.zjut.manageservice.pojo.Orders;
import com.zjut.manageservice.pojo.Orders;
import com.zjut.manageservice.mapper.OrdersMapper;
import com.zjut.manageservice.pojo.vo.OrdersQuery;
import com.zjut.manageservice.pojo.vo.OrdersQuery;
import com.zjut.manageservice.pojo.vo.OrdersQuery;
import com.zjut.manageservice.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Override
    public void pageQuery(Page<Orders> pageParam, OrdersQuery ordersQuery) {
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (ordersQuery == null) {
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }
        String ordersNum = ordersQuery.getOrdersNum();
        BigDecimal max = ordersQuery.getPricemax();
        BigDecimal min = ordersQuery.getPricemin();
        Integer state = ordersQuery.getState();
        String begin = ordersQuery.getBegintime();
        queryWrapper.eq("is_deleted",0);
        queryWrapper.ne("state",3);
        if (!StringUtils.isEmpty(ordersNum)) {
            queryWrapper.like("orders_num", ordersNum);
        }
        if (!StringUtils.isEmpty(max)) {
            queryWrapper.le("total_price", max);
        }
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge("total_price", min);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("gmt_create", begin);
        }
        if (!StringUtils.isEmpty(state)) {
            queryWrapper.eq("state", state);
        }

        baseMapper.selectPage(pageParam, queryWrapper);
    }



    @Override
    public List<Orders> idasclist(OrdersQuery ordersQuery) {
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (ordersQuery == null) {
            List<Orders> list = this.list(queryWrapper);
            return list;
        }
        String ordersNum = ordersQuery.getOrdersNum();
        BigDecimal max = ordersQuery.getPricemax();
        BigDecimal min = ordersQuery.getPricemin();
        Integer state = ordersQuery.getState();
        String begin = ordersQuery.getBegintime();
        queryWrapper.eq("is_deleted",0);
        queryWrapper.ne("state",3);
        if (!StringUtils.isEmpty(ordersNum)) {
            queryWrapper.like("orders_num", ordersNum);
        }
        if (!StringUtils.isEmpty(max)) {
            queryWrapper.le("price", max);
        }
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge("price", min);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("gmt_create", begin);
        }
        if (!StringUtils.isEmpty(state)) {
            queryWrapper.eq("state", state);
        }

        List<Orders> list = this.list(queryWrapper);
        return list;
    }






    @Override
    public void pageHistoryQuery(Page<Orders> pageParam, OrdersQuery ordersQuery) {
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (ordersQuery == null) {
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }
        String ordersNum = ordersQuery.getOrdersNum();
        BigDecimal max = ordersQuery.getPricemax();
        BigDecimal min = ordersQuery.getPricemin();
        Integer state = ordersQuery.getState();
        String begin = ordersQuery.getBegintime();
        queryWrapper.eq("is_deleted",0);
        queryWrapper.eq("state",3);
        if (!StringUtils.isEmpty(ordersNum)) {
            queryWrapper.like("orders_num", ordersNum);
        }
        if (!StringUtils.isEmpty(max)) {
            queryWrapper.le("total_price", max);
        }
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge("total_price", min);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("gmt_create", begin);
        }
        if (!StringUtils.isEmpty(state)) {
            queryWrapper.eq("state", state);
        }

        baseMapper.selectPage(pageParam, queryWrapper);
    }

}
