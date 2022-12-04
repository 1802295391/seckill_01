package com.zjut.manageservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.manageservice.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.manageservice.pojo.dto.FrontGoodsQuery;
import com.zjut.manageservice.pojo.vo.GoodsQuery;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
public interface GoodsService extends IService<Goods> {

    void pageQuery(Page<Goods> pageParam, GoodsQuery goodsQuery);

    List<Goods> idasclist(GoodsQuery goodsQuery);

    void importGoodsData(MultipartFile file, GoodsService goodsService);

    void pageBackQuery(Page<Goods> pageParam, GoodsQuery goodsQuery);

    Goods setAudit(String id);

    List<Goods> goodslist();

    Map<String, Object> FrontpageQuery(Page<Goods> pageParam, FrontGoodsQuery goodsQuery);
}
