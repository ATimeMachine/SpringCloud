package com.example.sleuth.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: Trace2Feign
 * Author:   SunEee
 * Date:     2018/5/14 9:54
 * Description: 微服务
 */
@FeignClient("trace-2")
@Component
public interface Trace2Feign {

    @GetMapping("trace2/{string}")
    String testString(@PathVariable("string") String string);
}
