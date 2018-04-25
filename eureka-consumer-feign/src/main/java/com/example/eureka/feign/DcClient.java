package com.example.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FileName: DcClient
 * Author:   SunEee
 * Date:     2018/4/25 11:12
 * Description: Feign
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
