package com.cogent.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger Log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		Log.info("Application started ......");
	}
	
	public static void main(String[] args) {
		
		Log.info("Spring Project executed...");
		Log.info("new change...");
		
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
