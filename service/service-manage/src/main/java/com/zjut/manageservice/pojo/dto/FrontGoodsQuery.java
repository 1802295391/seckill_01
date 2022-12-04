package com.zjut.manageservice.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
@ApiModel(value = "前台商品查询对象", description = "前台商品查询对象封装")
@Data
public class FrontGoodsQuery {



    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;

    @ApiModelProperty(value = "发布时间", example = "2019-01-01 10:10:10")
    private String begintime;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换
    @ApiModelProperty(value = "秒杀开始时间", example = "2019-01-01 10:10:10")
    private String time;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换
}
