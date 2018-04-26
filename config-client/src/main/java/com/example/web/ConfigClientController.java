package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: ConfigClientController
 * Author:   SunEee
 * Date:     2018/4/26 13:39
 * Description:
 */
@RestController
public class ConfigClientController {

   /* @Value("${info}")
    private String hello;*/

    @Value("${abc}")
    private String abc;

    @Value("${girl.beautiful}")
    private String girl;

    /*@GetMapping("hello")
    public String getHello(){
        return this.hello;
    }*/

    @GetMapping("girl")
    public String getGirl(){
        return this.girl;
    }

    @GetMapping("abc")
    public String getAbc(){
        return this.abc;
    }

}
