package com.jull.textanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "com.jull")
public class TextanalyzerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TextanalyzerApplication.class, args);
	}
}
