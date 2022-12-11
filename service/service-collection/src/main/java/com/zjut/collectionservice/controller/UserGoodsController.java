package com.zjut.collectionservice.controller;


import com.zjut.collectionservice.pojo.UserGoods;
import com.zjut.collectionservice.service.UserGoodsService;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.zjut.commonutils.JwtUtils.getMemberIdByJwtToken;

/**
 * <p>
 * 管理表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@RestController
@CrossOrigin
@RequestMapping("/collectionservice/user-goods")
public class UserGoodsController {

    @Autowired
    private UserGoodsService userGoodsService;

    @PostMapping("ownStar")
    public R ownStar(HttpServletRequest request){
        String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        if(token=="请先登录"){
            return R.error().message("你还未登录，请先登录");
        }
        userGoodsService.getById(token);
        return R.ok();
    }
}

