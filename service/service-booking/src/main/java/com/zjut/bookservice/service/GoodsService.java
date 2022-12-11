package com.zjut.bookservice.service;

import com.zjut.bookservice.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.commonutils.R;

/**
 * <p>
 * 产品表 服务类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
public interface GoodsService extends IService<Goods> {
    R getPageGoods(String goodsId);
}
