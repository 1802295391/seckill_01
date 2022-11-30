package com.zjut.manageservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjut.commonutils.R;
import com.zjut.manageservice.pojo.Customer;
import com.zjut.manageservice.pojo.Goods;
import com.zjut.manageservice.pojo.Goods;

import com.zjut.manageservice.pojo.excel.ExcelGoodsExport;
import com.zjut.manageservice.pojo.vo.GoodsQuery;
import com.zjut.manageservice.pojo.vo.GoodsQuery;
import com.zjut.manageservice.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-11-29
 */
@Api(description="商品管理")
@CrossOrigin
@RestController
@RequestMapping("/manageservice/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @ApiOperation(value = "分页商品列表")
    @PostMapping("{page}/{limit}")
    public R pageQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "GoodsQuery", value = "查询对象")
            @RequestBody(required = false) GoodsQuery goodsQuery) {
        Page<Goods> pageParam = new Page<>(page, limit);
        goodsService.pageQuery(pageParam, goodsQuery);

        List<Goods> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return R.ok().data("total", total).data("rows", records);
    }

    @ApiOperation(value = "新增商品")
    @PostMapping
    public R save(
            @ApiParam(name = "goodsy", value = "商品对象", required = true)
            @RequestBody Goods goodsy) {
        goodsService.save(goodsy);
        String id = goodsy.getId();
        return R.ok().data("id",id);
    }


    @ApiOperation(value = "根据ID修改商品")
    @PostMapping("update")
    public R updateById(
            @ApiParam(name = "goodsy", value = "商品对象", required = true)
            @RequestBody Goods goodsy){
        goodsService.updateById(goodsy);
        String id = goodsy.getId();
        return R.ok().data("id",id);
    }


    @DeleteMapping("{id}")
    @ApiOperation(value = "根据ID删除商品")
    public R removeById(@PathVariable("id") String id) {
        goodsService.removeById(id);
        return R.ok();
    }




    @PostMapping("excel")
    @ApiOperation(value = "打印商品列表")
    public R exlist(@ApiParam(name = "GoodsQuery", value = "查询对象", required = false)
                    @RequestBody(required = false) GoodsQuery goodsQuery) {

        List<Goods> list = goodsService.idasclist(goodsQuery);
        List<ExcelGoodsExport> list1=new ArrayList<>();
        for (int i=0;i<list.size();i++) {

            Goods goods=list.get(i);
            ExcelGoodsExport excelGoodsExport = new ExcelGoodsExport();
            BeanUtils.copyProperties(goods,excelGoodsExport);

//            excelGoodsExport.setId(Goods.getId());
//            excelGoodsExport.setCareer(Goods.getCareer());
//            excelGoodsExport.setGmtCreate(Goods.getGmtCreate());
//            excelGoodsExport.setIntro(Goods.getIntro());
//            excelGoodsExport.setLevel(Goods.getLevel());
//            excelGoodsExport.setName(Goods.getName());
//            excelGoodsExport.setGmtModified(Goods.getGmtModified());
            list1.add(excelGoodsExport);
        }
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        //String s = Integer.toString(sun++);
        String fileName = "D:\\"+uuid+".xlsx";
        EasyExcel.write(fileName, ExcelGoodsExport.class).sheet("商品列表").doWrite(list1);
        return R.ok().data("address",fileName);
    }




    @ApiOperation(value = "Excel批量导入")
    @PostMapping("addGoods")
    public R addGoods(MultipartFile file) {
//1 获取上传的excel文件 MultipartFile
//返回错误提示信息
       goodsService.importGoodsData(file,goodsService);
//判断返回集合是否为空
        return R.ok();
    }




    @ApiOperation(value = "根据ID查询商品")
    @GetMapping("{id}")
    public R getById(
            @ApiParam(name = "id", value = "商品ID", required = true)
            @PathVariable String id){
        Goods goods = goodsService.getById(id);
        return R.ok().data("item", goods);
    }


    @ApiOperation(value = "混子")
    @GetMapping("publish")
    public R hunzi(){

        return R.ok();
    }






    @ApiOperation(value = "分页被退回的商品列表")
    @PostMapping("back/{page}/{limit}")
    public R pageBackQuery(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "GoodsQuery", value = "查询对象")
            @RequestBody(required = false) GoodsQuery goodsQuery) {
        Page<Goods> pageParam = new Page<>(page, limit);
        goodsService.pageBackQuery(pageParam, goodsQuery);

        List<Goods> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return R.ok().data("total", total).data("rows", records);
    }



    @ApiOperation(value = "重新提交")
    @GetMapping("rool/{id}")
    public R roolBackById(
            @PathVariable("id") String id){
         Goods goods = new Goods();
         goods=goodsService.setAudit(id);
         goodsService.updateById(goods);
        return R.ok();
    }
}

