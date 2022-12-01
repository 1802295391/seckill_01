package com.zjut.auditservice.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "订单查询对象", description = "订单查询对象封装")
@Data
public class OrdersQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "订单号,模糊查询")
    private String ordersId;
    @ApiModelProperty(value = "订单状态")
    private Integer state;
    @ApiModelProperty(value = "订单价格最小值")
    private BigDecimal pricemin;
    @ApiModelProperty(value = "订单价格最大值")
    private BigDecimal pricemax;
    @ApiModelProperty(value = "订单创建时间", example = "2019-01-01 10:10:10")
    private String begintime;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换
}