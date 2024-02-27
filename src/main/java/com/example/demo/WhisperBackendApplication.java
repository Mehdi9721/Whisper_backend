package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhisperBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhisperBackendApplication.class, args);
		System.out.println("whisper started....");
	}

}
