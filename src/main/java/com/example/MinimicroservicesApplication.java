package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MinimicroservicesApplication implements MiniGreetingController{

	public static void main(String[] args) {
		SpringApplication.run(MinimicroservicesApplication.class, args);
	}
	
	@Override
	public String miniGreeting(){
		String x = System.getProperty("server.port");
		System.out.println(x);
		return "Hello";
	}
}
