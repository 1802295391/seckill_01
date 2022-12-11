package com.zjut.bookservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.bookservice.pojo.UserGoods;
import com.zjut.bookservice.mapper.UserGoodsMapper;
import com.zjut.bookservice.service.UserGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjut.commonutils.R;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 收藏表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@Service
public class UserGoodsServiceImpl extends ServiceImpl<UserGoodsMapper, UserGoods> implements UserGoodsService {
    @Override
    public List<UserGoods>  getGoodsByUserID (String userId){
        QueryWrapper<UserGoods> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",userId);
        List<UserGoods> list= baseMapper.selectList(wrapper);

        return list;

    }
}
