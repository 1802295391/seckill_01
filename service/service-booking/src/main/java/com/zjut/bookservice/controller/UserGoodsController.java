package com.zjut.bookservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.bookservice.pojo.Customer;
import com.zjut.bookservice.pojo.Goods;
import com.zjut.bookservice.pojo.UserGoods;
import com.zjut.bookservice.service.CustomerService;
import com.zjut.bookservice.service.GoodsService;
import com.zjut.bookservice.service.UserGoodsService;
import com.zjut.commonutils.JwtUtils;
import com.zjut.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 收藏表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@RestController
@RequestMapping("/bookservice/user-goods")
@CrossOrigin
public class UserGoodsController {
    @Autowired
    private UserGoodsService userGoodsService;
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private CustomerService customerService;
    //查看自己的预约
    @GetMapping("ownBooking")
    public R ownStar(HttpServletRequest request){
       String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        if(token=="请先登录"){
            return R.error().message("你还未登录，请先登录");
        }
       // String token="1596558950512316414";
        List<UserGoods> list = userGoodsService.getGoodsByUserID(token);
        System.out.println(list.size());
        List<Goods> goodsList=new ArrayList<>();
        for (UserGoods o : list)
        {

            QueryWrapper<Goods> wrapper =new QueryWrapper<>();
            wrapper.eq("id",o.getGoodsId());
            Goods one = goodsService.getOne(wrapper);
            goodsList.add(one);

        }
        System.out.println(goodsList);
        return R.ok().data("goodlist",goodsList);
    }




    @PostMapping("ownStar2/{id}")
    public R ownStar2( @PathVariable String id){

        if(id=="请先登录"){
            return R.error().message("请先登录");
        }
        List<UserGoods> list = userGoodsService.getGoodsByUserID(id);
        System.out.println(list.size());
        List<Goods> goodsList=new ArrayList<>();
        for (UserGoods o : list)
        {
            Page<Goods> pageGoods = new Page<>(1,8);
            QueryWrapper<Goods> wrapper =new QueryWrapper<>();
            System.out.println(o.getGoodsId());
            wrapper.eq("id",o.getGoodsId());
            Goods one = goodsService.getOne(wrapper);
            goodsList.add(one);

        }
        return R.ok().data("goodlist",goodsList);
    }

    @GetMapping("ownBooked/{id}")//传入的id为商品id 判断该用户是否已经预约
    public R ownBooked(@PathVariable String id,HttpServletRequest request){
        String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        System.out.println("这里是id"+id);
        // String token="1596558950512316414";
        QueryWrapper<UserGoods> wrapper =new QueryWrapper<>();
        wrapper.eq("goods_id",id);
        wrapper.eq("user_id",token);
        List<UserGoods> list = userGoodsService.list(wrapper);
        System.out.println(list);
        if(list.size()>0)
        {
            return R.ok().success(true);
        }
        else  return  R.ok().success(false);
    }
    //预约收藏商品
    @PostMapping("addBook/{id}")
    public R addBook(@PathVariable String id,HttpServletRequest request){
        String token = JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        System.out.println("这里是id"+id);
        Goods goods = goodsService.getById(id);
        Customer customer = customerService.getById(token);
        Integer customerLevel = customer.getLevel();
        Integer goodsLevel = goods.getLevel();
        if(customerLevel<goodsLevel){
            return R.error().message("你的等级还不够");
        }
        else {
            UserGoods userGoods = new UserGoods();
            userGoods.setUserId(token);
            userGoods.setGoodsId(id);
            userGoodsService.save(userGoods);
            return R.ok();
        }
    }

    //取消预约收藏商品
    @PostMapping("removeBook/{id}")
    public R removeBook(@PathVariable String id,HttpServletRequest request){
        String token =JwtUtils.getMemberIdByJwtToken(request);
        System.out.println("测试用户预约token"+token);
        System.out.println("这里是id"+id);
        QueryWrapper<UserGoods> wrapper =new QueryWrapper<>();
        wrapper.eq("goods_id",id);
        wrapper.eq("user_id",token);
        userGoodsService.remove(wrapper);
        return R.ok();
    }





}

