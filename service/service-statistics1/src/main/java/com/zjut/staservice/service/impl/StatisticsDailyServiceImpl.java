package com.zjut.staservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjut.staservice.client.CustomerClient;
import com.zjut.staservice.pojo.StatisticsDaily;
import com.zjut.staservice.mapper.StatisticsDailyMapper;
import com.zjut.staservice.service.StatisticsDailyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 网站统计日数据 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
@Service
public class StatisticsDailyServiceImpl extends ServiceImpl<StatisticsDailyMapper, StatisticsDaily> implements StatisticsDailyService {
    @Qualifier("com.zjut.staservice.client.CustomerClient")
    @Autowired
    private CustomerClient ucenterClient;
    @Override
    public void createStatisticsByDay(String day) {
//删除已存在的统计对象
            QueryWrapper<StatisticsDaily> dayQueryWrapper = new QueryWrapper<>();
            dayQueryWrapper.eq("date_calculated", day);
            baseMapper.delete(dayQueryWrapper);
//获取统计信息
            Integer registerNum = (Integer) ucenterClient.registerCount(day).getData().get("countRegister");
            Integer loginNum = RandomUtils.nextInt(100, 200);//TODO
            Integer clinchNum = (Integer) ucenterClient.clinchCount(day).getData().get("countClinch");
            Integer refundNum =(Integer) ucenterClient.refundCount(day).getData().get("countRefund");
        System.out.println("**********************************"+registerNum);
        System.out.println(clinchNum);
//创建统计对象
            StatisticsDaily daily = new StatisticsDaily();
            daily.setRegisterNum(registerNum);
            daily.setLoginNum(loginNum);
            daily.setClinchNum(clinchNum);
            daily.setRefundNum(refundNum);
            daily.setDateCalculated(day);
            baseMapper.insert(daily);
    }

    @Override
    public Map<String, Object> getChartData(String begin, String end, String type) {
        QueryWrapper<StatisticsDaily> dayQueryWrapper = new QueryWrapper<>();
        dayQueryWrapper.select(type, "date_calculated");
        dayQueryWrapper.between("date_calculated", begin, end);
        List<StatisticsDaily> dayList = baseMapper.selectList(dayQueryWrapper);
        Map<String, Object> map = new HashMap<>();
        List<Integer> dataList = new ArrayList<Integer>();
        List<String> dateList = new ArrayList<String>();

        for (int i = 0; i < dayList.size(); i++) {
            StatisticsDaily daily = dayList.get(i);
            dateList.add(daily.getDateCalculated());
            switch (type) {
                case "register_num":
                    dataList.add(daily.getRegisterNum());
                    break;
                case "login_num":
                    dataList.add(daily.getLoginNum());
                    break;
                case "clinch_num":
                    dataList.add(daily.getClinchNum());
                    break;
                case "refund_num":
                    dataList.add(daily.getRefundNum());
                    break;
                default:
                    break;
            }
        }
        map.put("dataList", dataList);
        map.put("dateList", dateList);
        return map;
    }

}

