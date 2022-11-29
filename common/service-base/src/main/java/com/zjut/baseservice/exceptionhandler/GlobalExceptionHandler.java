package com.zjut.baseservice.exceptionhandler;



import com.zjut.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();//打印异常
        return R.error().message("执行了自定义异常");
    }


    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public R Gulierror(GuliException e) {
        log.error(e.getMessage());
        e.printStackTrace();//打印异常
        return R.error().code(e.getCode()).message(e.getMsg());
    }
}
