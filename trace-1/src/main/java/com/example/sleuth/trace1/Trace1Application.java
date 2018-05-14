package com.example.sleuth.trace1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.example.sleuth")
@EnableFeignClients("com.example.sleuth.feign")
public class Trace1Application {

	public static void main(String[] args) {
		SpringApplication.run(Trace1Application.class, args);
	}
}
