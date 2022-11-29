package com.zjut.manageservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Customer;
import com.zjut.manageservice.pojo.excel.ExcelCustomerExport;
import com.zjut.manageservice.pojo.vo.CustomerQuery;
import com.zjut.manageservice.pojo.vo.CustomerVo;
import com.zjut.manageservice.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Api(description="用户管理")
@CrossOrigin
@RestController
@RequestMapping("/manageservice/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @ApiOperation(value = "分页客戶列表")
    @PostMapping("{page}/{limit}")
    public R pageQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "CustomerQuery", value = "查询对象", required = false)
            @RequestBody(required = false) CustomerQuery CustomerQuery) {
        Page<Customer> pageParam = new Page<>(page, limit);
        customerService.pageQuery(pageParam, CustomerQuery);

        List<Customer> records = pageParam.getRecords();
        List<CustomerVo> customerVos=new ArrayList<>();
        for (int i=0;i<records.size();i++) {

            Customer customer=records.get(i);
            CustomerVo customerVo = new CustomerVo();
            BeanUtils.copyProperties(customer,customerVo);
            customerVos.add(customerVo);
        }
        long total = pageParam.getTotal();
        return R.ok().data("total", total).data("rows",  customerVos);
    }

    @ApiOperation(value = "新增客戶")
    @PostMapping
    public R save(
            @ApiParam(name = "customery", value = "客戶对象", required = true)
            @RequestBody Customer customery) {
        customerService.save(customery);
        return R.ok();
    }


    @ApiOperation(value = "根据ID修改客戶")
    @PostMapping("update")
    public R updateById(
            @ApiParam(name = "customery", value = "客戶对象", required = true)
            @RequestBody Customer customery){
        customerService.updateById(customery);
        return R.ok();
    }


    @DeleteMapping("{id}")
    @ApiOperation(value = "根据ID删除客戶")
    public R removeById(@PathVariable("id") String id) {
        customerService.removeById(id);
        return R.ok();
    }





    @PostMapping("excel")
    @ApiOperation(value = "打印客户列表")
    public R exlist(@ApiParam(name = "CustomerQuery", value = "查询对象", required = false)
                    @RequestBody(required = false)  CustomerQuery customerQuery) {

        List<Customer> list = customerService.idasclist(customerQuery);
        List<ExcelCustomerExport> list1=new ArrayList<>();
        for (int i=0;i<list.size();i++) {

            Customer Customer=list.get(i);
            ExcelCustomerExport excelCustomerExport = new ExcelCustomerExport();
            BeanUtils.copyProperties(Customer,excelCustomerExport);

//            excelCustomerExport.setId(Customer.getId());
//            excelCustomerExport.setCareer(Customer.getCareer());
//            excelCustomerExport.setGmtCreate(Customer.getGmtCreate());
//            excelCustomerExport.setIntro(Customer.getIntro());
//            excelCustomerExport.setLevel(Customer.getLevel());
//            excelCustomerExport.setName(Customer.getName());
//            excelCustomerExport.setGmtModified(Customer.getGmtModified());
            list1.add(excelCustomerExport);
        }
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        //String s = Integer.toString(sun++);
        String fileName = "D:\\"+uuid+".xlsx";
        EasyExcel.write(fileName, ExcelCustomerExport.class).sheet("客户列表").doWrite(list1);
        return R.ok().data("address",fileName);
    }
}

