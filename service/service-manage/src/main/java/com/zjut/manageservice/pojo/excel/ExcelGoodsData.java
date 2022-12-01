package com.zjut.manageservice.pojo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ExcelGoodsData {

    @ExcelProperty(index = 0)
    private String title;

    @ExcelProperty(index = 1)
    private String coverImage;

    @ExcelProperty(index = 2)
    private String detailImage;

    @ExcelProperty(index = 3)
    private Date startTime;

    @ExcelProperty(index = 4)
    private Integer level;
    @ExcelProperty(index = 5)
    private BigDecimal price;

    @ExcelProperty(index = 6)
    private Integer num;

    @ExcelProperty(index = 7)
    private Integer limitNum;

    @ExcelProperty(index =8)
    private Integer isRefund;

    @ExcelProperty(index = 9)
    private String description;

}