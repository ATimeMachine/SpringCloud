package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * FileName: MySink
 * Author:   SunEee
 * Date:     2018/5/10 14:59
 * Description: 消息通道 (信息发送流程：先定义通道 —>使用通道—> 监听通道 —> 处理结果)
 */
public interface MySink {
    String INPUT = "mychannel";

    @Input(INPUT) //@Input注解的参数则表示了消息通道的名称
    SubscribableChannel input(); //返回一个SubscribableChannel对象，该对象用来维护消息通道订阅者
}
