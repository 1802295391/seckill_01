package com.zjut.commonutils.dto;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Customer对象", description="用户表")
public class CustomerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")

    private String id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "微信id")
    private String openid;

    @ApiModelProperty(value = "银行卡号")
    private String bankCards;

    @ApiModelProperty(value = "支付密码")
    private String payPassword;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;
    @TableLogic
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

    @ApiModelProperty(value = "是否禁用 1（true）已禁用，  0（false）未禁用")
    private Integer isDisabled;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
