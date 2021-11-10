package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	final static Logger LOGGER=LogManager.getLogger(EmployeeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		LOGGER.info("app started.....");
	}

}
