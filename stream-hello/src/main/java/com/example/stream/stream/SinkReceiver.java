package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * FileName: SinkReceiver
 * Author:   SunEee
 * Date:     2018/5/10 10:08
 * Description: 用来接收RabbitMQ发送来的消息
 */
@EnableBinding({MySink.class})
public class SinkReceiver {

    @StreamListener(MySink.INPUT) //注册为对MySink消息通道的监听处理器
    //@SendTo(Source.OUTPUT)  //定义回执发送的消息通道(信息发送流程：先定义通道 —>使用通道—> 监听通道 —> 处理结果)
    public void receive(Object playload) {
        System.out.println("信息通道监听器(1) ----->" + playload);
        //return "信息通道监听器(1)发送 :" + playload;
    }

}
