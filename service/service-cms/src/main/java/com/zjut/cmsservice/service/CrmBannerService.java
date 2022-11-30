package com.zjut.cmsservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.cmsservice.pojo.CrmBanner;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-11-24
 */
public interface CrmBannerService extends IService<CrmBanner> {


    void pageQuery(Page<CrmBanner> pageParam, Object o);

    List<CrmBanner> selectIndexList();
}
