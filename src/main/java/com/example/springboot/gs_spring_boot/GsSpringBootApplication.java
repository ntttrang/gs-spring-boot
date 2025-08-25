package com.example.springboot.gs_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GsSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(GsSpringBootApplication.class, args);
	}

}
