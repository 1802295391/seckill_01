package com.zjut.manageservice.pojo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ExcelGoodsExport {
    @ExcelProperty("商品ID")
    private String id;

    @ExcelProperty("商品标题")

    private String title;

    @ExcelProperty("秒杀开始时间")

    private Date startTime;



    @ExcelProperty("商品等级")
    private Integer level;
    @ExcelProperty("商品价格")

    private BigDecimal price;


    @ExcelProperty("商品数量")
    private Integer num;


    @ExcelProperty(value = "限制数量")
    private Integer limitNum;

    @ExcelProperty("创建时间")
    private Date gmtCreate;

    @ExcelProperty("更新时间")
    private Date gmtModified;
}
