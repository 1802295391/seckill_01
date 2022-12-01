package com.zjut.auditservice.service.impl;

import com.zjut.auditservice.pojo.Goods;
import com.zjut.auditservice.mapper.GoodsMapper;
import com.zjut.auditservice.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
