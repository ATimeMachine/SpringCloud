package com.example.eureka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: DcController
 * Author:   SunEee
 * Date:     2018/4/24 16:26
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer")
    public String dc(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/dc";
        System.out.println(url);
        return "consumer ->" + restTemplate.getForObject(url,String.class);
    }

}
