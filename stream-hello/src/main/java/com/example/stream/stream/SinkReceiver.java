package com.example.stream.stream;

import com.example.stream.streamhello.StreamHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * FileName: SinkReceiver
 * Author:   SunEee
 * Date:     2018/5/10 10:08
 * Description: 用来接收RabbitMQ发送来的消息
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        logger.info("Received : " + playload);
    }

}
