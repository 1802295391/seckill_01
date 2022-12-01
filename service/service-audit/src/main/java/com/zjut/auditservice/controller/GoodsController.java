package com.zjut.auditservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.auditservice.pojo.Goods;
import com.zjut.auditservice.pojo.Manage;
import com.zjut.auditservice.pojo.vo.GoodsQuery;
import com.zjut.auditservice.service.GoodsService;
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
 * 产品表 前端控制器
 *
 * </p>
 * @author xww
 * @since 2022-11-30
 */
@RestController
@RequestMapping("/auditservice/goods")
@CrossOrigin
public class GoodsController {
    //审核管理员上传的商品
    //同意和驳回  驳回原因

    @Autowired
    private GoodsService goodsService;

    @PostMapping("pageGoodsCondition/{current}/{limit}")
    public R pageGoodsCondition(@ApiParam(name = "current",value = "当前页码",required = true)
                                @PathVariable long current,
                                @ApiParam(name = "limit",value = "每页记录数", required = true)
                                @PathVariable long limit,
                                @ApiParam(name = "GoodsQuery", value = "查询对象")
                                @RequestBody(required = false) GoodsQuery goodsQuery) {
        //创建page对象
        Page<Goods> pageGoods = new Page<>(current,limit);

        //构建条件
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        //查询结果按修改时间排序
        wrapper.orderByDesc("gmt_modified");
        // 多条件组合查询
        // mybatis学过 动态sql
        String title = goodsQuery.getTitle();
        Integer level = goodsQuery.getLevel();
        BigDecimal minPrice = goodsQuery.getMinPrice();
        BigDecimal maxPrice = goodsQuery.getMaxPrice();

        String begin = goodsQuery.getBeginTime();
        wrapper.eq("is_deleted",0);
        wrapper.eq("audit",0);
        //判断条件值是否为空，如果不为空拼接条件
        if(!StringUtils.isEmpty(title)) {
            //构建条件
            wrapper.like("title",title);
        }
        if (!StringUtils.isEmpty(maxPrice)) {
            wrapper.le("price", maxPrice);
        }
        if (!StringUtils.isEmpty(minPrice)) {
            wrapper.ge("price", minPrice);
        }
        if(!StringUtils.isEmpty(level)) {
            wrapper.eq("level",level);
        }
        if(!StringUtils.isEmpty(begin)) {
            wrapper.ge("gmt_create",begin);
        }


        //调用方法实现条件查询分页
        goodsService.page(pageGoods,wrapper);

        long total = pageGoods.getTotal();//总记录数
        List<Goods> records = pageGoods.getRecords(); //数据list集合
        return R.ok().data("total",total).data("rows",records);
    }


    @ApiOperation(value = "同意商品发布")
    @PostMapping("allowOrder/{id}")
    public R allowOrder(@RequestBody Goods goods) {
        goods.setAudit(1);
        boolean flag = goodsService.updateById(goods);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "驳回商品")
    @PostMapping("disallowOrder/{id}")
    public R disallowOrder(@RequestBody Goods goods) {
        goods.setAudit(2);
        boolean flag = goodsService.updateById(goods);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "驳回原因")
    @PostMapping("{cause}")
    public R cause(@RequestBody Goods goods){
        boolean flag = goodsService.updateById(goods);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }

    }
}

