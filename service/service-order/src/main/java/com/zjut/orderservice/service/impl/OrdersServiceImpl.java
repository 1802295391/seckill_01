package com.zjut.orderservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.commonutils.dto.CustomerDto;
import com.zjut.commonutils.dto.GoodsOrderDto;
import com.zjut.orderservice.client.OrderClient;
import com.zjut.orderservice.pojo.Orders;
import com.zjut.orderservice.mapper.OrdersMapper;
import com.zjut.orderservice.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjut.orderservice.utils.OrderNoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private OrderClient orderClient;
    @Override
    public String saveOrder(String courseId, String memberIdByJwtToken,Integer userNum) {

        int sum=0;
         GoodsOrderDto orderGoods = orderClient.getOrderGoods(courseId);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+orderGoods);
       CustomerDto orderUser = orderClient.getOrderUser(memberIdByJwtToken);
       if(orderGoods.getLevel()>orderUser.getLevel())
       {
           return "您等级不够";
       }
       if(userNum>orderGoods.getNum())
       {
           return "库存不足";
       }
       if(userNum<=0)
       {
           System.out.println("+++++++++++++++"+userNum);
           return "别捣乱";
       }
       /*
       统计用户已购买的当前商品的数量
        */
         QueryWrapper<Orders> objectQueryWrapper = new QueryWrapper<>();
       objectQueryWrapper.eq("goods_id",courseId);
       objectQueryWrapper.eq("user_id",memberIdByJwtToken);
       objectQueryWrapper.eq("state",1);
         List<Orders> orders1 = baseMapper.selectList(objectQueryWrapper);
         if(orders1!=null)
         for (int i=0;i<orders1.size();i++)
         {
             Orders orders = orders1.get(i);
            sum+= orders.getGoodsNum();
         }
        System.out.println("=========================================="+sum);
        if(userNum>orderGoods.getLimitNum()-sum)
       {
           return "超过购买限制";
       }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String newDate = sdf.format(new Date());
        Date startTime = orderGoods.getStartTime();
        System.out.println("====================="+orderGoods.getStartTime());
        String time=sdf.format(startTime);
        if(time.compareTo(newDate)>0 ) {
            return "秒杀未开始";
        }
        Orders orders = new Orders();
        orders.setDetailImage(orderGoods.getDetailImage());
        orders.setUserId(orderUser.getId());
        orders.setUsername(orderUser.getUsername());
        orders.setGoodsId(orderGoods.getId());
        orders.setTitle(orderGoods.getTitle());
        orders.setPhone(orderUser.getPhone());
        orders.setTotalPrice(orderGoods.getPrice());
        orders.setGoodsNum(userNum);
        orders.setState(0);
        orders.setOrdersNum(OrderNoUtil.getOrderNo());
            baseMapper.insert(orders);
        return orders.getOrdersNum();
    }
}
