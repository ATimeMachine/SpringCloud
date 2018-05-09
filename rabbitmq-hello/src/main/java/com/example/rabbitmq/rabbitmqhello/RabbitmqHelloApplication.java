package com.example.rabbitmq.rabbitmqhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.rabbitmq")
public class RabbitmqHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqHelloApplication.class, args);
	}
}
