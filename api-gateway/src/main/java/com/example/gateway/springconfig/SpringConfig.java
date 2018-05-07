package com.example.gateway.springconfig;

import com.example.gateway.filter.PermissionFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: SpringConfig
 * Author:   SunEee
 * Date:     2018/5/7 17:25
 * Description: Spring配置
 */
@Configuration
public class SpringConfig {

    @Bean
    PermissionFilter permissionFilter(){
        return new PermissionFilter();
    }
}
