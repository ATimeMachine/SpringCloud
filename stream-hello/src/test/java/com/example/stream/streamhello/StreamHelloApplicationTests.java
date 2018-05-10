package com.example.stream.streamhello;

import com.example.stream.stream.MySource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableBinding(MySource.class)
public class StreamHelloApplicationTests {

	@Autowired
	private MySource mySource;

	@Test
	public void contextLoads() {
		Message<String> build = MessageBuilder.withPayload("hello 123").build();
		mySource.output().send(build);

	}

}
