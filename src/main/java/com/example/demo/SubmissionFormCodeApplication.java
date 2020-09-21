package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan
@SpringBootApplication
public class SubmissionFormCodeApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(SubmissionFormCodeApplication.class);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormCodeApplication.class, args);
	}

}
