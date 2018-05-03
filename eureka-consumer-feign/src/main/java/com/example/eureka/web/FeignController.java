package com.example.eureka.web;

import com.example.eureka.feign.DcClient;
import com.example.eureka.feign.RibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: DcController
 * Author:   SunEee
 * Date:     2018/4/24 16:26
 * Description:
 */
@RestController
public class FeignController {

   /* @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer")
    public String dc(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url,String.class);
    }*/

   @Autowired
   DcClient dcClient;

   @Autowired
   RibbonClient ribbonClient;

   @GetMapping("/consumer")
   public String dc(){
      String consumer = dcClient.consumer();
      String consumer1 = "远程再调用远程" + ribbonClient.consumer();
      return consumer + "===" + consumer1;
   }

   @GetMapping("feignCircle")
   public String circle(){
      String s = "feign ->" + ribbonClient.circle();
      System.out.println();
      return s;
   }

   @GetMapping("/feign/{param}")
   public String testBalanced(@PathVariable("param") String param){
      return ribbonClient.testBalanced(param);
   }
}
