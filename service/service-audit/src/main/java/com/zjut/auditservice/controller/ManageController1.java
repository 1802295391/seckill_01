package com.zjut.auditservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.auditservice.pojo.Manage;
import com.zjut.auditservice.pojo.vo.ManagerQuery;
import com.zjut.auditservice.service.ManageService1;
import com.zjut.commonutils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 管理表 前端控制器
 * </p>
 *
 * @author xww
 * @since 2022-11-30
 */
@Api(description="管理员管理")
@RestController
@CrossOrigin
@RequestMapping("/auditservice/manage")
public class ManageController1 {
    @Autowired
    private ManageService1 manageService;

    @ApiOperation(value = "管理员列表")
    @GetMapping("findAll")
    public R FindAllManager(){
        List<Manage> list = manageService.list(null);
        return R.ok().data("items",list);
    }

    @ApiOperation(value = "新增管理员")
    @PostMapping("addManager")
    public R addManger(@RequestBody Manage manage) {
        boolean save = manageService.save(manage);
        if(save) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "根据id修改管理员")
    @PostMapping("updateManager")
    public R updateById(@RequestBody  Manage manage) {
        boolean flag = manageService.updateById(manage);
        if(flag) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "根据id删除管理员")
    @DeleteMapping("{id}")
    public R removeTeacherByID(@PathVariable String id){
        boolean flag = manageService.removeById(id);
        return (flag ?R.ok():R.error());

    }


    @ApiOperation(value = "根据ID查询管理员")
    @GetMapping("{id}")
    public R getById(@PathVariable String id){
        Manage byId = manageService.getById(id);
        return R.ok().data("item", byId);
    }

    @ApiOperation(value = "带条件的分页")
    @PostMapping("pageManagerCondition/{current}/{limit}")
    public R pageTeacherCondition(@PathVariable long current, @PathVariable long limit,
                                  @RequestBody(required = false) ManagerQuery managerQuery) {
        //创建page对象
        Page<Manage> pageManager = new Page<>(current,limit);

        //构建条件
        QueryWrapper<Manage> wrapper = new QueryWrapper<>();
        // 多条件组合查询
        // mybatis学过 动态sql
        String name = managerQuery.getName();
        //判断条件值是否为空，如果不为空拼接条件
        if(!StringUtils.isEmpty(name)) {
            //构建条件
            wrapper.like("name",name);
        }

        //调用方法实现条件查询分页
       manageService.page(pageManager,wrapper);

        long total = pageManager.getTotal();//总记录数
        List<Manage> records = pageManager.getRecords(); //数据list集合
        return R.ok().data("total",total).data("rows",records);
    }
}

