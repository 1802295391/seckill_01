package com.zjut.commonutils.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 产品表
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="封装Goods对象", description="给Order")
public class GoodsOrderDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "产品标题")
    private String title;

    @ApiModelProperty(value = "详细图片")
    private String detailImage;


    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "产品描述")
    private String description;
    @ApiModelProperty(value = "是否为可退款产品(0可退款，1不可退款)")
    private Integer isRefund;
}
