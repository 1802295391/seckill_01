package com.zjut.manageservice.controller.front;

import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Goods;
import com.zjut.manageservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/manageservice/front")
@CrossOrigin
public class indexController {
    @Autowired
    private GoodsService goodsService;
    @GetMapping("index")
    public R index() {
//查询前8条热门课程

        List<Goods> goods = goodsService.goodslist();
//查询前4条名师


        return R.ok().data("eduList",goods);
    }
}
