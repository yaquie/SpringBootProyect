package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.SpringBootProjectApplication;
import com.example.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);
	// instancia de la capa repository
	@Autowired
	private IPersonaRepository repo;

	@Override
	public String registrar(String nombre) {

		return repo.registrar(nombre);

	}

}
