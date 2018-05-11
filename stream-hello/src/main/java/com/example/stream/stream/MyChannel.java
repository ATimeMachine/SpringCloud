package com.example.stream.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * FileName: MySink
 * Author:   SunEee
 * Date:     2018/5/10 14:59
 * Description: 消息通道 (信息发送流程：先定义通道 —>使用通道—> 监听通道 —> 处理结果)
 */
@Component
public interface MyChannel {
    String INPUT_CHANNEL = "input_channel";  //position3
    String OUTPUT_CHANNEL = "output_channel";

    String RETURN_INPUT = "return_input";
    String RETURN_OUTPUT = "return_output";


    //注解@Input声明了它是一个输入类型的通道，名字是MySink.INPUT_CHANNEL，
    //也就是position3的input_channel。这一名字与application配置文件中input_channel应该一致，
    //表明注入了一个名字叫做input_channel的通道，它的类型是input，订阅的主题是position2处声明的modest这个主题
    @Input(MyChannel.INPUT_CHANNEL)
    SubscribableChannel logInput();

    //注解@Output声明了它是一个输出类型的通道，名字是output_channel。
    // 这一名字与application中通道名一致，表明注入了一个名字为output_channel的通道，
    // 类型是output，发布的主题名为mydest。
    @Output(MyChannel.OUTPUT_CHANNEL)
    MessageChannel logOutPut();

    @Input(MyChannel.RETURN_INPUT)
    SubscribableChannel input1();

    @Output(MyChannel.RETURN_OUTPUT)
    MessageChannel output1();
}
