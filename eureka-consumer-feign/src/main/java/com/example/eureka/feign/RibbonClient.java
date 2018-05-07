package com.example.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: RibbonClient
 * Author:   SunEee
 * Date:     2018/4/25 13:42
 * Description: Ribbon
 */
@FeignClient(value = "eureka-consumer-ribbon",fallback = RibbonClientFallback.class)
//因为fallback 有了实现类，所以要加上名字
@Component
public interface RibbonClient {

    @GetMapping("/consumer")
    String consumer();

    @GetMapping("/ribbonCircle")
    String circle();

    @GetMapping("/ribbon/{param}")
    String testBalanced(@PathVariable("param") String param);
}
