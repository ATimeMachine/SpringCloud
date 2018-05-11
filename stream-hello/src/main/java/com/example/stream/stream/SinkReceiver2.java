package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * FileName: SinkReceiver2
 * Author:   SunEee
 * Date:     2018/5/10 15:20
 * Description: 消息通道接收类 (信息发送流程：先定义通道 —>使用通道—> 监听通道 —> 处理结果)
 */
@EnableBinding(MyChannel.class)
public class SinkReceiver2 {

    @StreamListener(MyChannel.RETURN_INPUT) //注册为对returnmsg消息主题的输入通道的监听处理器
    public void receive(Object playloud) {
        System.out.println("信息通道监听器(2)----->返回接收: " + playloud);
    }
}
