package com.example.rabbitmq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * FileName: RabbitConfig
 * Author:   SunEee
 * Date:     2018/5/9 14:52
 * Description: 配置消息队列Bean(配置信息发布的模式)
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
