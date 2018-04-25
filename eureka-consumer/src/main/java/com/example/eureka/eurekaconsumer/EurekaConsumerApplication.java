package com.example.eureka.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.eureka")
@EnableDiscoveryClient
public class EurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
