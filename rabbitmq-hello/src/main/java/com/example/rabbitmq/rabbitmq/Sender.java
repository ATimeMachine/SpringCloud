package com.example.rabbitmq.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * FileName: Sender
 * Author:   SunEee
 * Date:     2018/5/9 14:38
 * Description: 发送者
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "Hello RabbitMq" + new Date();
        System.out.println("sender: " + msg);
        this.rabbitTemplate.convertAndSend("hello",msg);
    }


}
