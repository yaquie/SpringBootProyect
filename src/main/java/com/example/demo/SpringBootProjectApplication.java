package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.demo","com.example.controller","com.example.service", "com.example.repository"})
public class SpringBootProjectApplication  {

//	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
