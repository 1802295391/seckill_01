package com.zjut.auditservice.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zjut.auditservice.service.GoodsService1;
import com.zjut.commonutils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@RestController
@RequestMapping("/auditservice/goods")
public class GoodsController1 {
    //审核管理员上传的商品
    //同意和驳回  驳回原因

    @Autowired
    private GoodsService1 goodsService;

    @ApiOperation(value = "同意商品发布")
    @PostMapping("allowOrder/{id}")
    public R allowOrder(@PathVariable String id) {
        UpdateWrapper updateWrapper = new UpdateWrapper();
        updateWrapper.eq("id",id);
        updateWrapper.set("audit",1);
        boolean flag= goodsService.update(null,updateWrapper);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "驳回商品")
    @PostMapping("disallowOrder/{id}")
    public R disallowOrder(@PathVariable String id) {
        UpdateWrapper updateWrapper2 = new UpdateWrapper();
        updateWrapper2.eq("id",id);
        updateWrapper2.set("audit",2);
        boolean flag= goodsService.update(null,updateWrapper2);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}

