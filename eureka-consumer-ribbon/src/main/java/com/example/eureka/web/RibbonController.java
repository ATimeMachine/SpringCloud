package com.example.eureka.web;

import org.springframework.beans.factory.annotation.Autowired;
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
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

   /* @Autowired
    LoadBalancerClient loadBalancerClient;*/

    /*@GetMapping("/consumer")
    public String dc(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url,String.class);
    }*/

    @GetMapping("/consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    @GetMapping("ribbonCircle")
    public String circle(){
        String s = "ribbon ->" + restTemplate.getForObject("http://eureka-consumer/consumer", String.class);
        System.out.println(s);
        return s;
    }
}
