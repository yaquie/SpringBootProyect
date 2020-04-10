package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.IPersonaService;

@SpringBootApplication(scanBasePackages={"com.example.demo","com.example.service", "com.example.repository"})
public class SpringBootProjectApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	//instanciando a la capa service
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		service = new PersonaServiceImpl();
		service.registrar("Luis Miguel");

	}

}
