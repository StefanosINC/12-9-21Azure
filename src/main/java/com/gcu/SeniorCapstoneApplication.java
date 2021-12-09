package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gcu")
@SpringBootApplication
public class SeniorCapstoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeniorCapstoneApplication.class, args);
	}

}
