package com.zjut.collectionservice.service;

import com.zjut.collectionservice.pojo.UserGoods;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 管理表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
public interface UserGoodsService extends IService<UserGoods> {

    void insertcollection(String goodsId, String memberIdByJwtToken);
}
