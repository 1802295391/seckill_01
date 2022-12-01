package com.zjut.manageservice.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.baseservice.exceptionhandler.GuliException;
import com.zjut.manageservice.pojo.Goods;
import com.zjut.manageservice.pojo.excel.ExcelGoodsData;
import com.zjut.manageservice.service.GoodsService;

import java.util.Map;

public class GoodsExcelListener extends AnalysisEventListener<ExcelGoodsData>
{
    public GoodsService goodsService;
    public GoodsExcelListener() {}
    //创建有参数构造，传递goodsService用于操作数据库
    public GoodsExcelListener(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
    //一行一行去读取excle内容
    @Override
    public void invoke(ExcelGoodsData user, AnalysisContext analysisContext) {
        if(user == null) {
            throw new GuliException(20001,"添加失败");
        }
        Goods goods=new Goods();
        goods.setTitle(user.getTitle());
        goods.setCoverImage(user.getCoverImage());
        goods.setDetailImage(user.getDetailImage());
        goods.setStartTime(user.getStartTime());
        goods.setLevel(user.getLevel());
        goods.setNum(user.getNum());
        goods.setLimitNum(user.getLimitNum());
        goods.setPrice(user.getPrice());
        goods.setDescription(user.getDescription());
        goods.setIsRefund(user.getIsRefund());
        goodsService.save(goods);
    }
    //读取excel表头信息
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息："+headMap);
    }
    //读取完成后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {}

}