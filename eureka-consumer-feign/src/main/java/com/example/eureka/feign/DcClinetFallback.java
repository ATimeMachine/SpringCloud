package com.example.eureka.feign;

import org.springframework.stereotype.Component;

/**
 * FileName: DcClinetFallback
 * Author:   SunEee
 * Date:     2018/5/7 14:29
 * Description: 熔断回调
 */
@Component
public class DcClinetFallback implements DcClient {
    @Override
    public String consumer() {
        System.out.println("调用服务的consumer方法失败，进行了熔断处理");
        return "consumer";
    }
}
