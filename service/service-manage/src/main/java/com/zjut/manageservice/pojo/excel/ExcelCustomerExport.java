package com.zjut.manageservice.pojo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ExcelCustomerExport {
    @ExcelProperty("客户ID")
    private String id;

    @ExcelProperty("客户姓名")

    private String username;

    @ExcelProperty("性别")

    private String sex;

    @ExcelProperty("客户手机号")

    private String phone;


    @ExcelProperty("会员等级")
    private Integer level;

    @ExcelProperty("创建时间")
    private Date gmtCreate;

    @ExcelProperty("更新时间")
    private Date gmtModified;
}
