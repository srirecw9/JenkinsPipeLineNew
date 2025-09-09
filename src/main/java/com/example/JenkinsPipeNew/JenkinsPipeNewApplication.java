package com.example.JenkinsPipeNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipeNewApplication {
@GetMapping("/get")
public String msg1() {
		return "Welcome to KLH Campus,Hyderabad";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipeNewApplication.class, args);
	}

}
