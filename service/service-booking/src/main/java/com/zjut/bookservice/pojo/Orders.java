package com.zjut.bookservice.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @author xww
 * @since 2022-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Orders对象", description="订单表")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "orders_id", type = IdType.ID_WORKER)
    private String ordersId;

    @ApiModelProperty(value = "订单号")
    private String ordersNum;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "产品id")
    private String goodsId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "产品名称")
    private String title;

    @ApiModelProperty(value = "详细图片")
    private String detailImage;

    @ApiModelProperty(value = "支付状态（0待支付。1已支付。2退款中.3已完成后续交易的历史订单）")
    private Integer state;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "总价格")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "购买总数")
    private Integer goodsNum;

    @ApiModelProperty(value = "是否删除(0-未删, 1-已删)")
    private Integer isDeleted;

    @ApiModelProperty(value = "是否为可退款产品(0可退款，1不可退款)")
    private Integer isRefund;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
