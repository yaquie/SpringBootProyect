package com.example.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bean.Persona;
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

	@Override
	public List<Persona> listAll() {
		return repo.listAll();
	}

	@Override
	public Persona findByid(int idPersona) {

		return repo.findByid(idPersona);
	}

	@Override
	public List<Persona> listAll02() {
		return repo.listAll02();
	}

	@Override
	public List<Persona> findByid02(int idPersona) {
		return repo.findByid02(idPersona);
	}

	@Override
	public Persona findByid03(int idPersona) {
		return repo.findByid03(idPersona);
	}

	@Override
	public Persona findByid04(int idPersona) {
		return repo.findByid04(idPersona);
	}

}
