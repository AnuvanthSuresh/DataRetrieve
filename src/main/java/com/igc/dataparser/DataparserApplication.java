package com.igc.dataparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan({ "com.igc" })
public class DataparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataparserApplication.class, args);
	}

}
