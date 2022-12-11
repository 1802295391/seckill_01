package com.zjut.bookservice.service;

import com.zjut.bookservice.pojo.UserGoods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjut.commonutils.R;

import java.util.List;

/**
 * <p>
 * 收藏表 服务类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
public interface UserGoodsService extends IService<UserGoods> {
    List<UserGoods> getGoodsByUserID  (String userId);
}
