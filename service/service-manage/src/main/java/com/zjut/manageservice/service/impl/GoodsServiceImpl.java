package com.zjut.manageservice.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.baseservice.exceptionhandler.GuliException;
import com.zjut.manageservice.listener.GoodsExcelListener;
import com.zjut.manageservice.pojo.Goods;
import com.zjut.manageservice.mapper.GoodsMapper;
import com.zjut.manageservice.pojo.dto.FrontGoodsQuery;
import com.zjut.manageservice.pojo.excel.ExcelGoodsData;
import com.zjut.manageservice.pojo.vo.GoodsQuery;
import com.zjut.manageservice.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public void pageQuery(Page<Goods> pageParam, GoodsQuery goodsQuery) {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (goodsQuery == null) {
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }
        String name = goodsQuery.getTitle();
        BigDecimal max = goodsQuery.getPricemax();
        BigDecimal min = goodsQuery.getPricemin();
        Integer audit = goodsQuery.getAudit();
        String begin = goodsQuery.getBegintime();
        queryWrapper.ne("audit",2);
        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("title", name);
        }
        if (!StringUtils.isEmpty(max)) {
            queryWrapper.le("price", max);
        }
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge("price", min);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("start_time", begin);
        }
        if (!StringUtils.isEmpty(audit)) {
            queryWrapper.eq("audit", audit);
        }

        baseMapper.selectPage(pageParam, queryWrapper);
    }

    @Override
    public List<Goods> idasclist(GoodsQuery goodsQuery) {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (goodsQuery == null) {
            List<Goods> list = this.list(queryWrapper);
            return list;
        }
        String name = goodsQuery.getTitle();
        BigDecimal max = goodsQuery.getPricemax();
        BigDecimal min = goodsQuery.getPricemin();
        Integer audit = goodsQuery.getAudit();
        String begin = goodsQuery.getBegintime();

        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("username", name);
        }
        if (!StringUtils.isEmpty(max)) {
            queryWrapper.le("price", max);
        }
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge("price", min);
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("start_time", begin);
        }
        if (!StringUtils.isEmpty(audit)) {
            queryWrapper.eq("audit", audit);
        }

        List<Goods> list = this.list(queryWrapper);
        return list;
    }

    @Override
    public void importGoodsData(MultipartFile file, GoodsService goodsService)
        {
            try {
//1 获取文件输入流
                InputStream inputStream = file.getInputStream();
// 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
                EasyExcel.read(inputStream, ExcelGoodsData.class, new GoodsExcelListener(goodsService)).sheet().doRead();
            }catch(Exception e) {
                e.printStackTrace();
                throw new GuliException(20002,"添加商品失败");
            }
        }








    @Override
    public void pageBackQuery(Page<Goods> pageParam, GoodsQuery goodsQuery) {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (goodsQuery == null) {
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }
        String name = goodsQuery.getTitle();
        BigDecimal max = goodsQuery.getPricemax();
        BigDecimal min = goodsQuery.getPricemin();
        String begin = goodsQuery.getBegintime();
        queryWrapper.eq("audit",2);
        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("title", name);
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
        baseMapper.selectPage(pageParam, queryWrapper);
    }

    @Override
    public Goods setAudit(String id) {


         Goods goods = baseMapper.selectById(id);
         goods.setAudit(0);
         goods.setCause("");

        return goods;
    }
    @Cacheable(value="goods",key ="'selectgoods'")
    @Override
    public List<Goods> goodslist() {
        QueryWrapper<Goods> queryWrapper=new QueryWrapper();
        queryWrapper.orderByDesc("gmt_create");
        queryWrapper.eq("audit",1);
        queryWrapper.last("limit 8");
        return baseMapper.selectList(queryWrapper);
    }



    @Override
    public Map<String, Object> FrontpageQuery(Page<Goods> pageParam, FrontGoodsQuery goodsQuery) {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_create");
        if (goodsQuery == null) {
            baseMapper.selectPage(pageParam, queryWrapper);
            return null;
        }

        BigDecimal price = goodsQuery.getPrice();


        String begin = goodsQuery.getBegintime();
        String create = goodsQuery.getTime();
        queryWrapper.eq("audit",1);
        if (!StringUtils.isEmpty(price)) {
            queryWrapper.orderByDesc("price");
        }
        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.orderByDesc("start_time");
        }
        if (!StringUtils.isEmpty(create)) {
            queryWrapper.orderByDesc("gmt_create");
        }


        baseMapper.selectPage(pageParam, queryWrapper);
        List<Goods> records=pageParam.getRecords();
        long current = pageParam.getCurrent();
        long pages = pageParam.getPages();
        long size = pageParam.getSize();
        long total = pageParam.getTotal();
        boolean hasNext = pageParam.hasNext();
        boolean hasPrevious = pageParam.hasPrevious();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("items", records);
        map.put("current", current);
        map.put("pages", pages);
        map.put("size", size);
        map.put("total", total);
        map.put("hasNext", hasNext);
        map.put("hasPrevious", hasPrevious);
        return map;
    }

}
