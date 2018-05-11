package com.example.stream.web;

import com.example.stream.stream.MyChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: StreamController
 * Author:   SunEee
 * Date:     2018/5/10 17:56
 * Description:
 */
@RestController
@EnableBinding(MyChannel.class)
public class StreamController {

    @Autowired
    private MyChannel mySink;

    @RequestMapping("stream/{string}")
    public String stream(@PathVariable("string") String string) {
        Message<String> build = MessageBuilder.withPayload(string).build();
        mySink.logOutPut().send(build);
        return "success";
    }
}
