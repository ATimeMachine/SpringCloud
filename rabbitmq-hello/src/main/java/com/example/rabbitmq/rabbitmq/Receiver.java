package com.example.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName: Receiver
 * Author:   SunEee
 * Date:     2018/5/9 14:46
 * Description: 接收者
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver: " + msg);

    }

}
