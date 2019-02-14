package com.quickr.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LoginConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginConsumerApplication.class, args);
	}

}

