package com.zjut.sms.controller;

import com.zjut.commonutils.R;
import com.zjut.sms.service.MsmService;
import com.zjut.sms.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/edumsm")
@CrossOrigin //跨域
public class MsmApicontroller{
    @Autowired
    private MsmService msmService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @GetMapping(value = "/send/{phone}")
    public R code(@PathVariable String phone) {
       String code = redisTemplate.opsForValue().get(phone);
       if(!StringUtils.isEmpty(code)) return R.ok();
        code=RandomUtil.getFourBitRandom();
        Map<String,Object> param = new HashMap<>();
        param.put("code", code);
        boolean isSend = msmService.send(phone, param);
        if(isSend) {
            redisTemplate.opsForValue().set(phone, code,10,TimeUnit.MINUTES);
            return R.ok();
        } else {
            return R.error().message("发送短信失败");
        }

    }
}