package com.example.eureka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: DcController
 * Author:   SunEee
 * Date:     2018/4/24 16:29
 * Description:
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc(){
        String services = "Services:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
