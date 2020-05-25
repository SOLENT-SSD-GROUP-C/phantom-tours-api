package com.ssdgroupc.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TourApiApplication {

	private static final Logger LOGGER = LogManager.getLogger(TourApiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TourApiApplication.class, args);
		LOGGER.info("Application Started");
		
	}

}