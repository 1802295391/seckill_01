package com.zjut.orderservice.controller;


import com.zjut.commonutils.R;
import com.zjut.orderservice.service.TPayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 支付日志表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-12-04
 */
@RestController
@RequestMapping("/orderservice/log")
@CrossOrigin
public class TPayLogController {
    @Autowired
    private TPayLogService payService;
    /**
     * 生成二维码
     *
     * @return
     */
    @GetMapping("/createNative/{orderNum}")
    public R createNative(@PathVariable String orderNum) {
        Map map = payService.createNative(orderNum);
        System.out.println("===================="+map);
        return R.ok().data(map);
    }


    @GetMapping("/queryPayStatus/{orderNum}")
    public R queryPayStatus(@PathVariable String orderNum) {
//调用查询接口
        Map<String, String> map = payService.queryPayStatus(orderNum);
        if (map == null) {//出错
            return R.error().message("支付出错");
        }
        if (map.get("trade_state").equals("SUCCESS")) {//如果成功
//更改订单状态
            payService.updateOrderStatus(map);

            return R.ok().message("支付成功");
        }
        return R.ok().code(25000).message("支付中");
    }
}
