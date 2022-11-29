package com.zjut.manageservice.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "商品查询对象", description = "商品查询对象封装")
@Data
public class GoodsQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "商品标题,模糊查询")
    private String title;
    @ApiModelProperty(value = "商品状态")
    private Integer audit;
    @ApiModelProperty(value = "商品价格最小值")
    private BigDecimal pricemin;
    @ApiModelProperty(value = "商品价格最大值")
    private BigDecimal pricemax;
    @ApiModelProperty(value = "秒杀开始时间", example = "2019-01-01 10:10:10")
    private String begintime;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换
}
