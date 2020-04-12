package com.example.service;

import java.util.List;

import com.example.bean.Persona;

public interface IPersonaService {
	String registrar(String nombre);

	public List<Persona> listAll();

	public List<Persona> listAll02();

	public Persona findByid(int idPersona);

	public List<Persona> findByid02(int idPersona);

	public Persona findByid03(int idPersona);

	public Persona findByid04(int idPersona);
}
