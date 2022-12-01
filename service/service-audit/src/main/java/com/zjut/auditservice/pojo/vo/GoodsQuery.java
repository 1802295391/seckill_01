package com.zjut.auditservice.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel(value = "商品查询对象", description = "商品查询对象封装")
@Data
public class GoodsQuery {


    @ApiModelProperty(value = "产品标题")
    private String title;

    @ApiModelProperty(value = "产品等级")
    private Integer level;

    @ApiModelProperty(value = "产品最低价格")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "产品最高价格")
    private BigDecimal maxPrice;

    @ApiModelProperty(value = "产品秒杀时间")
    private String beginTime;

}
