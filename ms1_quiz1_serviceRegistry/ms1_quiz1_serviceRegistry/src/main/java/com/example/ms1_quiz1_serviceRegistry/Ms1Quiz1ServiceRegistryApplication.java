package com.example.ms1_quiz1_serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms1Quiz1ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1Quiz1ServiceRegistryApplication.class, args);
	}

}
