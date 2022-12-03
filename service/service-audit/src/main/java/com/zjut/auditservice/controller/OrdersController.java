package com.zjut.auditservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.auditservice.pojo.Goods;
import com.zjut.auditservice.pojo.Orders;
import com.zjut.auditservice.pojo.vo.OrdersQuery;
import com.zjut.auditservice.service.OrdersService;
import com.zjut.commonutils.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@RestController
@CrossOrigin
@RequestMapping("/auditservice/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @ApiOperation(value = "订单分页查询条件")
    @PostMapping("pageOrderCondition/{current}/{limit}")
    public R pageQuery(
            @ApiParam(name = "current", value = "当前页码", required = true)
            @PathVariable Long current,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "OrdersQuery", value = "查询对象", required = false)
            @RequestBody(required = false) OrdersQuery ordersQuery) {

        //创建page对象
        Page<Orders> pageOrders= new Page<>(current,limit);

        //构建条件
        QueryWrapper<Orders> wrapper = new QueryWrapper<>();
        //查询结果按修改时间排序
        wrapper.orderByDesc("gmt_modified");
        // 多条件组合查询
        // mybatis学过 动态sql
        String orders_num = ordersQuery.getOrders_num();
        BigDecimal pricemin = ordersQuery.getPricemin();
        BigDecimal pricemax = ordersQuery.getPricemax();
        String begintime = ordersQuery.getBegintime();
        wrapper.eq("is_deleted",0);
        wrapper.eq("state",2);
        if (!StringUtils.isEmpty(orders_num)) {
            wrapper.like("orders_num", orders_num);
        }
        if (!StringUtils.isEmpty(pricemax)) {
            wrapper.le("total_price", pricemax);
        }
        if (!StringUtils.isEmpty(pricemin)) {
            wrapper.ge("total_price", pricemin);
        }
        if (!StringUtils.isEmpty(begintime)) {
            wrapper.ge("gmt_create", begintime);
        }

        //调用方法实现条件查询分页
        ordersService.page(pageOrders,wrapper);

        long total = pageOrders.getTotal();//总记录数
        List<Orders> records = pageOrders.getRecords(); //数据list集合
        return R.ok().data("total",total).data("rows",records);
    }

    @ApiOperation(value = "根据id删除订单")
    @DeleteMapping("{id}")
    public R removeOrderByID(@PathVariable String id){
        boolean flag = ordersService.removeById(id);
        return (flag ?R.ok():R.error());
    }
}

