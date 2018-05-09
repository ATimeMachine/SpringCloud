package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: ConfigClientController
 * Author:   SunEee
 * Date:     2018/4/26 13:39
 * Description:
 */
@RestController
@RefreshScope //实时刷新注解，要不然bus刷新了key,值还是不会变化
public class ConfigClientController {

   @Value("${spring.datasource.password}")
    private String hello;

    @Value("${abc}")
    private String abc;

    @Value("${girl.beautiful}")
    private String girl;

    @GetMapping("hello")
    public String getHello(){
        return this.hello;
    }

    @GetMapping("girl")
    public String getGirl(){
        return this.girl;
    }

    @GetMapping("abc")
    public String getAbc(){
        return this.abc;
    }

}
