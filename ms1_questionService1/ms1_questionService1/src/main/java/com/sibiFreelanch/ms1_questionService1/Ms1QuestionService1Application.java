package com.sibiFreelanch.ms1_questionService1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Ms1QuestionService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms1QuestionService1Application.class, args);
		System.out.println("MS >> QuestionService : app starts!!!");
	}

}
