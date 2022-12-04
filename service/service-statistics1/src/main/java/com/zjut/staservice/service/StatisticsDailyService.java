package com.zjut.staservice.service;

import com.zjut.staservice.pojo.StatisticsDaily;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 网站统计日数据 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
public interface StatisticsDailyService extends IService<StatisticsDaily> {

    void createStatisticsByDay(String day);

    Map<String, Object> getChartData(String begin, String end, String type);
}
