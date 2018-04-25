package com.example.eureka.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: SpringConfigure
 * Author:   SunEee
 * Date:     2018/4/24 16:20
 * Description: 配置
 */
@Configuration
public class SpringConfigure {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
