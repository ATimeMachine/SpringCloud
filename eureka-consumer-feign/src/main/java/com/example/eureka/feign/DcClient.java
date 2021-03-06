package com.example.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FileName: DcClient
 * Author:   SunEee
 * Date:     2018/4/25 11:12
 * Description: Feign
 */
@FeignClient(value = "eureka-client",fallback = DcClinetFallback.class)
@Component
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
