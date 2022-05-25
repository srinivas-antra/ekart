package com.example.ekart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkartApplication.class, args);
		System.out.println("In main class");
		System.out.println("In spring boot class");
		System.out.println("New line");
	}

}
