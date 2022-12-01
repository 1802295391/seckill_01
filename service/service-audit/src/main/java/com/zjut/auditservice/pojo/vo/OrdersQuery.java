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
    private String ordersNum;
    @ApiModelProperty(value = "订单状态")
    private Integer state;
}