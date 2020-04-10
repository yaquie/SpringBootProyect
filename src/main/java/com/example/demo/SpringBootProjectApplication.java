package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.service.IPersonaService;
import com.example.service.PersonaServiceImpl;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	// instancia de la capa service
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service = new PersonaServiceImpl();
		service.registrar("Jakie");

	}

}
