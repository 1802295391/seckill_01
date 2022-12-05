package com.zjut.collectionservice.controller;


import com.zjut.collectionservice.service.UserGoodsService;
import com.zjut.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

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
@CrossOrigin
@RestController
@RequestMapping("/collectionservice/user-goods")
public class UserGoodsController {
    @Autowired
    private UserGoodsService userGoodsService;
        @PostMapping("star/{goodsId}")
    public R star(@PathVariable String goodsId, HttpServletRequest request )
        {

            userGoodsService.insertcollection(goodsId,getMemberIdByJwtToken(request));
            return R.ok();
        }

}

