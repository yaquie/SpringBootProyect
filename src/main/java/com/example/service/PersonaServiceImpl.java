package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.SpringBootProjectApplication;
import com.example.repository.IPersonaRepository;
import com.example.repository.PersonaRepositoryImpl;

public class PersonaServiceImpl implements IPersonaService {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);
	// instancia de la capa repository
	private IPersonaRepository repo;

	@Override
	public void registrar(String nombre) {
		repo = new PersonaRepositoryImpl();
		repo.registrar(nombre);

	}

}
