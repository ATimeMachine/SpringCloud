package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * FileName: MySource
 * Author:   SunEee
 * Date:     2018/5/10 15:17
 * Description: 使用消息通道发送 (信息发送流程：先定义通道 —>使用通道—> 监听通道 —> 处理结果)
 */
public interface MySource {
    String OUTPUT = MySink.INPUT;

    @Output(OUTPUT)//@Output注解中描述了消息通道的名称
    MessageChannel output(); //返回MessageChannel对象的方法，该对象中有一个向消息通道发送消息的方法。
}
