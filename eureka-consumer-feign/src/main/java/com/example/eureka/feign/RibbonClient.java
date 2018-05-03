package com.example.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: RibbonClient
 * Author:   SunEee
 * Date:     2018/4/25 13:42
 * Description: Ribbon
 */
@FeignClient("eureka-consumer-ribbon")
public interface RibbonClient {

    @GetMapping("/consumer")
    String consumer();

    @GetMapping("/ribbonCircle")
    String circle();

    @GetMapping("/ribbon/{param}")
    String testBalanced(@PathVariable("param") String param);
}
