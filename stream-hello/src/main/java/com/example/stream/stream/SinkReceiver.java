package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * FileName: SinkReceiver
 * Author:   SunEee
 * Date:     2018/5/11 13:53
 * Description: 接收器
 */
@EnableBinding(MyChannel.class)
public class SinkReceiver {

    @StreamListener(MyChannel.INPUT_CHANNEL) //注册为对mydest消息主题的输入通道的监听处理器
    @SendTo(MyChannel.RETURN_OUTPUT)
    public String receive(Object playloud) {
        System.out.println("信息通道监听器(1) =====>: " + playloud);
        return "通道返回内容" + playloud;
    }
}
