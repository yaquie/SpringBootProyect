package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.SpringBootProjectApplication;

public class PersonaRepositoryImpl implements IPersonaRepository {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a : " + nombre);
	}

}
