package com.zjut.commonutils.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@ApiModel(value="Goods对象", description="产品表")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")

    private String id;

    @ApiModelProperty(value = "产品标题")
    private String title;

    @ApiModelProperty(value = "封面图片")
    private String coverImage;

    @ApiModelProperty(value = "详细图片")
    private String detailImage;

    @ApiModelProperty(value = "秒杀开始时间")
    private Date startTime;

    @ApiModelProperty(value = "审核字段（0审核。1发布。2退回）")
    private Integer audit;

    @ApiModelProperty(value = "退回原因")
    private String cause;

    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "数量")
    private Integer num;

    @ApiModelProperty(value = "限制数量")
    private Integer limitNum;

    @ApiModelProperty(value = "产品描述")
    private String description;
    @ApiModelProperty(value = "是否为可退款产品(0可退款，1不可退款)")
    private Integer isRefund;
    @ApiModelProperty(value = "是否删除(0-未删, 1-已删)")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
