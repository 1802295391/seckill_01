package com.zjut.bookservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.bookservice.pojo.Goods;
import com.zjut.bookservice.mapper.GoodsMapper;
import com.zjut.bookservice.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjut.commonutils.R;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    @Override
    public R getPageGoods(String bookId){
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.eq("id",bookId);
        baseMapper.selectById(bookId);
        return R.ok();
    }
}
