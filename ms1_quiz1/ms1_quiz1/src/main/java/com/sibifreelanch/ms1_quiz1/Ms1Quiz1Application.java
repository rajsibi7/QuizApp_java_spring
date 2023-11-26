package com.sibifreelanch.ms1_quiz1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ms1Quiz1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms1Quiz1Application.class, args);
	}

}
