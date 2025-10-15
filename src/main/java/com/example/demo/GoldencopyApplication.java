package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoldencopyApplication {

	public static void main(String[] args) {
	    System.out.println("Hello World Before");
		SpringApplication.run(GoldencopyApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Hello World2");
		System.out.println("Hello World3");
	}

}
