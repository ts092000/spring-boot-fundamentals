package com.example.fundamentals;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FundamentalsApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("Hello pluralsight!");
	}

}
