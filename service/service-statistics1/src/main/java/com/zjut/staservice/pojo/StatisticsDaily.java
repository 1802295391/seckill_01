package com.zjut.staservice.pojo;

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
 * 网站统计日数据
 * </p>
 *
 * @author atguigu
 * @since 2022-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StatisticsDaily对象", description="网站统计日数据")
public class StatisticsDaily implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "统计日期")
    private String dateCalculated;

    @ApiModelProperty(value = "注册人数")
    private Integer registerNum;

    @ApiModelProperty(value = "登录人数")
    private Integer loginNum;

    @ApiModelProperty(value = "每日订单成交量")
    private Integer clinchNum;

    @ApiModelProperty(value = "每日订单退款量")
    private Integer refundNum;
@TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;
@TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
