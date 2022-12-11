package com.zjut.sms.service;
import com.zjut.sms.util.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class VerifyService {
   public boolean verify (String cardno,String idcard,String mobile,String name){
        String host = "https://ckid.market.alicloudapi.com";
        String path = "/lundear/verifyBankFour";
        String method = "GET";
        String appcode = "2403e571664946b582a87ea9a3c268c8";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("cardno", cardno);
        querys.put("idcard", idcard);
        querys.put("mobile", mobile);
        querys.put("name", name);


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            HttpEntity entity = response.getEntity();
             String body = EntityUtils.toString(entity, "gbk");
            System.out.println(body);
                return body.contains("\"code\":0");

            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
}
