package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.Persona;
import com.example.service.IPersonaService;

@Controller
@RequestMapping("/main")
public class PersonaController {

	@Autowired
	IPersonaService service;

	@GetMapping("/bienvenidos")
	public @ResponseBody String save(@RequestParam(name = "usuario") String name) {
		return service.registrar(name);
	}

	@GetMapping("/listAll")
	public @ResponseBody List<Persona> listAll() {
		return service.listAll();
	}

	@GetMapping("/listAll02")
	public @ResponseBody List<Persona> listAll02() {
		return service.listAll02();
	}

	@GetMapping("/listById")
	public @ResponseBody Persona findById(@RequestParam(name = "id") int idPersona) {
		return service.findByid(idPersona);
	}

	@GetMapping("/listById02")
	public @ResponseBody List<Persona> findById02(@RequestParam(name = "id") int idPersona) {
		return service.findByid02(idPersona);
	}

	@GetMapping("/listById03")
	public @ResponseBody Persona findById03(@RequestParam(name = "id") int idPersona) {
		return service.findByid03(idPersona);
	}
	
	@GetMapping("/listById04")
	public @ResponseBody Persona findById04(@RequestParam(name = "id") int idPersona) {
		return service.findByid03(idPersona);
	}
}
