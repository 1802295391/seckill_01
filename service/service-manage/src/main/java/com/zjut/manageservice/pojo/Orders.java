package com.zjut.manageservice.pojo;

import java.math.BigDecimal;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Orders对象", description="订单表")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @ExcelProperty("订单ID")
    @ApiModelProperty(value = "订单id")
    @TableId(value = "orders_id", type = IdType.ID_WORKER_STR)
    private String ordersId;

    @ExcelProperty("订单号")
    @ApiModelProperty(value = "订单号")
    private String ordersNum;

    @ExcelProperty("用户id")
    @ApiModelProperty(value = "用户id")
    private String userId;

    @ExcelProperty("商品ID")
    @ApiModelProperty(value = "商品id")
    private String goodsId;

    @ExcelProperty("用户名")
    @ApiModelProperty(value = "用户名")
    private String username;

    @ExcelProperty("商品名称")
    @ApiModelProperty(value = "商品名称")
    private String title;

    @ExcelProperty("支付状态（0待支付。1已支付。2退款中）")
    @ApiModelProperty(value = "支付状态（0待支付。1已支付。2退款中）")
    private Integer state;

    @ExcelProperty("用户手机号")
    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ExcelProperty("总价格")
    @ApiModelProperty(value = "总价格")
    private BigDecimal totalPrice;

    @ExcelProperty("购买总数")
    @ApiModelProperty(value = "购买总数")
    private Integer goodsNum;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

    @ExcelProperty("是否为可退款产品")
    @ApiModelProperty(value = "是否为可退款产品")
    private Integer isRefund;

    @ExcelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ExcelProperty("更新时间")
@TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
