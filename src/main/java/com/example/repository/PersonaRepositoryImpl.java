package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.SpringBootProjectApplication;

@Repository
public class PersonaRepositoryImpl implements IPersonaRepository {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	@Override
	public String registrar(String nombre) {
		String mensaje;
		mensaje="Bienvenido : " + nombre +" Tus datos fueron registrados correctamente";
		return mensaje;
	}

}
