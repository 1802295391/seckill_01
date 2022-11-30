package com.zjut.cmsservice.controller.front;

import com.zjut.cmsservice.pojo.CrmBanner;
import com.zjut.cmsservice.service.CrmBannerService;
import com.zjut.commonutils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cms/frontbanner")
@Api(description = "网站首页Banner列表")
@CrossOrigin //跨域
public class FrontBannerController {

    @Autowired
    private CrmBannerService bannerService;
    @ApiOperation(value = "获取首页banner")
    @GetMapping("getAllBanner")
    public R index() {
        List<CrmBanner> list = bannerService.selectIndexList();
        return R.ok().data("bannerList", list);
    }
}