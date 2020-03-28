package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan (basePackages = "com.sk")
@Configuration
public class SkApplication {

	public static void main(String[] args) {

		SpringApplication.run(SkApplication.class, args);
	}

}
