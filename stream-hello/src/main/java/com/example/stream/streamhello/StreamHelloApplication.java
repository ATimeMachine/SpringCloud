package com.example.stream.streamhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.stream")
public class StreamHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamHelloApplication.class, args);
	}
}
