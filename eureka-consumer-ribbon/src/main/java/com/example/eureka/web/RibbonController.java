package com.example.eureka.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/ribbon/{param}")
    public String testBalanced(@PathVariable("param") String param){
        System.out.println(param);
        return param;
    }

    @GetMapping("ribbon/hy")
    @HystrixCommand(fallbackMethod = "error")
    public String testHystrix(){
        //int i = 1/0;
        String result = restTemplate.getForObject("http://eureka-consumer/consumer/hystrix", String.class);
        System.out.println(result);
        return result;
    }

    public String error(Throwable throwable){
        System.out.println(throwable.getMessage());
        return "error";
    }
}
