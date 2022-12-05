package com.zjut.orderservice.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.wxpay.sdk.WXPayUtil;
import com.zjut.orderservice.pojo.Orders;
import com.zjut.orderservice.pojo.TPayLog;
import com.zjut.orderservice.mapper.TPayLogMapper;
import com.zjut.orderservice.service.OrdersService;
import com.zjut.orderservice.service.TPayLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjut.orderservice.utils.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



/**
 * <p>
 * 支付日志表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@Service
public class TPayLogServiceImpl extends ServiceImpl<TPayLogMapper, TPayLog> implements TPayLogService {


    @Autowired
    private OrdersService orderService;
    @Override
    public Map createNative(String orderNum) {
        try {
//根据订单id获取订单信息
            QueryWrapper<Orders> wrapper = new QueryWrapper<>();
            wrapper.eq("orders_num",orderNum);
            Orders order = orderService.getOne(wrapper);
            System.out.println(order);
            Map m = new HashMap();
//1、设置支付参数
            m.put("appid", "wx74862e0dfcf69954");
            m.put("mch_id", "1558950191");
            m.put("nonce_str", WXPayUtil.generateNonceStr());
            m.put("body", order.getTitle());
            m.put("out_trade_no", orderNum);
            m.put("total_fee", order.getTotalPrice().multiply(new BigDecimal("100")).longValue()+"");
            m.put("spbill_create_ip", "127.0.0.1");
            m.put("notify_url", "http://guli.shop/api/order/weixinPay/weixinNotify\n");
            m.put("trade_type", "NATIVE");
//2、HTTPClient来根据URL访问第三方接口并且传递参数
            HttpClient client = new HttpClient("https://api.mch.weixin.qq.com/pay/unifiedorder");
//client设置参数
            client.setXmlParam(WXPayUtil.generateSignedXml(m, "T6m9iK73b0kn9g5v426MKfHQH7X8rKwb"));
            client.setHttps(true);
            client.post();
//3、返回第三方的数据
            String xml = client.getContent();
            Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
//4、封装返回结果集
            Map map = new HashMap<>();
            map.put("out_trade_no", orderNum);
            map.put("course_id", order.getGoodsId());
            map.put("total_fee", order.getTotalPrice());
            map.put("result_code", resultMap.get("result_code"));
            map.put("code_url", resultMap.get("code_url"));
//微信支付二维码2小时过期，可采取2小时未支付取消订单
      //    redisTemplate.opsForValue().set(orderNo, map, 120,TimeUnit.MINUTES);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }







    @Override
    public void updateOrderStatus(Map<String, String> map) {
//获取订单id
        String orderNum = map.get("out_trade_no");
//根据订单id查询订单信息
        QueryWrapper<Orders> wrapper = new QueryWrapper<>();
        wrapper.eq("orders_num",orderNum);
        Orders order = orderService.getOne(wrapper);
        if(order.getState() == 1) return;
        order.setState(1);
        orderService.updateById(order);
//记录支付日志
        TPayLog payLog=new TPayLog();
        payLog.setOrderNo(order.getOrdersNum());//支付订单号
        payLog.setPayTime(new Date());
        payLog.setPayType(1);//支付类型
        payLog.setTotalFee(order.getTotalPrice());//总金额(分)
        payLog.setTradeState(map.get("trade_state"));//支付状态
        payLog.setTransactionId(map.get("transaction_id"));
        payLog.setAttr(JSONObject.toJSONString(map));
        baseMapper.insert(payLog);//插入到支付日志表
    }
    @Override
    public Map queryPayStatus(String orderNo) {
        try {
//1、封装参数
            Map m = new HashMap<>();
            m.put("appid", "wx74862e0dfcf69954");
            m.put("mch_id", "1558950191");
            m.put("out_trade_no", orderNo);
            m.put("nonce_str", WXPayUtil.generateNonceStr());
//2、设置请求
            HttpClient client = new
                    HttpClient("https://api.mch.weixin.qq.com/pay/orderquery");
            client.setXmlParam(WXPayUtil.generateSignedXml(m, "T6m9iK73b0kn9g5v426MKfHQH7X8rKwb"));
            client.setHttps(true);
            client.post();
//3、返回第三方的数据
            String xml = client.getContent();
            Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
//6、转成Map
//7、返回
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
