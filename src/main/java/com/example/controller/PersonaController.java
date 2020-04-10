package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.IPersonaService;

@Controller
@RequestMapping("/main")
public class PersonaController {

	@Autowired
	IPersonaService service;

	@GetMapping("/bienvenidos")
	public @ResponseBody String save(@RequestParam(name="usuario") String name) {
		return service.registrar(name);
	}

}
