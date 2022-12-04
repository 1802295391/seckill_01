package com.zjut.staservice.controller;


import com.zjut.commonutils.R;
import com.zjut.staservice.service.StatisticsDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 网站统计日数据 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
@CrossOrigin
@RestController
@RequestMapping("/staservice/daily")
public class StatisticsDailyController {
    @Autowired
    private StatisticsDailyService statisticsDailyService;
    @GetMapping("{day}")
    public R createStatisticsByDate(@PathVariable String day) {
        statisticsDailyService.createStatisticsByDay(day);
        return R.ok();
    }
    @GetMapping("show-chart/{begin}/{end}/{type}")
    public R showChart(@PathVariable String begin,@PathVariable String
            end,@PathVariable String type){
        Map<String, Object> map = statisticsDailyService.getChartData(begin, end, type);
        return R.ok().data(map);
    }
}

