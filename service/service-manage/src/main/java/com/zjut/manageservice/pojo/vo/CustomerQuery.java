package com.zjut.manageservice.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "客户查询对象", description = "客户查询对象封装")
@Data
public class CustomerQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "客户名称,模糊查询")
    private String username;
    @ApiModelProperty(value = "会员等级")
    private Integer level;
    @ApiModelProperty(value = "客户性别")
    private String sex;
    @ApiModelProperty(value = "是否禁用 1（true）已禁用，  0（false）未禁用")
    private Integer isDisabled;
    @ApiModelProperty(value = "查询开始时间", example = "2019-01-01 10:10:10")
    private String begin;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换
}
