package com.zjut.manageservice.controller.front;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Goods;
import com.zjut.manageservice.pojo.dto.FrontGoodsQuery;
import com.zjut.manageservice.pojo.vo.GoodsQuery;
import com.zjut.manageservice.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manageservice/front")
@CrossOrigin
public class indexController {
    @Autowired
    private GoodsService goodsService;
    @GetMapping("index")
    public R index() {
        List<Goods> goods = goodsService.goodslist();
        return R.ok().data("eduList",goods);
    }


    @ApiOperation(value = "前台分页商品列表")
    @PostMapping("{page}/{limit}")
    public R pageQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "FrontGoodsQuery", value = "查询对象")
            @RequestBody(required = false) FrontGoodsQuery goodsQuery) {
        Page<Goods> pageParam = new Page<>(page, limit);
        Map<String,Object> map=goodsService.FrontpageQuery(pageParam, goodsQuery);

        return R.ok().data(map);
    }
}
