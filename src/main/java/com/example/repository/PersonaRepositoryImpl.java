package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.bean.Persona;
import com.example.demo.SpringBootProjectApplication;

@Repository
public class PersonaRepositoryImpl implements IPersonaRepository {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	@Override
	public String registrar(String nombre) {
		String mensaje;
		mensaje = "Bienvenido : " + nombre + " Tus datos fueron registrados correctamente";
		return mensaje;
	}

	@Override
	public List<Persona> listAll() {
		List<Persona> list = new ArrayList<>();

		Persona p = new Persona();
		p.setId(1);
		p.setName("Jakie");
		p.setLastName("Alarcon");
		p.setAge(24);

		Persona p1 = new Persona();
		p1.setId(2);
		p1.setName("Josef");
		p1.setLastName("Vila");
		p1.setAge(22);

		Persona p2 = new Persona();
		p2.setId(3);
		p2.setName("Clorinda");
		p2.setLastName("Puma");
		p2.setAge(25);

		list.add(p);
		list.add(p1);
		list.add(p2);

		return list;
	}

	@Override
	public Persona findByid(int idPersona) {

		List<Persona> list = listAll();

		Persona persona = new Persona();

		System.out.println("size :" + list.size());
		for (int i = 0; i < list.size(); i++) {

			persona = list.get(idPersona);

			persona.getId();
			persona.getName();
			persona.getLastName();
			persona.getAge();
		}

		return persona;
	}

	@Override
	public List<Persona> listAll02() {
		List<Persona> lista = new ArrayList<>();

		Persona p = new Persona();
		p.setId(1);
		p.setName("Ives");
		p.setLastName("Alarcon");
		p.setAge(30);

		Persona p1 = new Persona();
		p1.setId(2);
		p1.setName("Fortunita");
		p1.setLastName("Reyes");
		p1.setAge(68);

		Persona p2 = new Persona();
		p2.setId(3);
		p2.setName("Juan");
		p2.setLastName("Alarcon");
		p2.setAge(68);

		lista.add(p);
		lista.add(p1);
		lista.add(p2);

		List<Persona> resultado = lista.stream().filter(c -> c.getLastName().equalsIgnoreCase("Alarcon"))
				.collect(Collectors.toList());
		System.out.println("resultado:: " + resultado.size());
		return resultado;
	}

	@Override
	public List<Persona> findByid02(int idPersona) {
		List<Persona> lista = listAll();
		List<Persona> resultado = lista.stream().filter(c -> c.getId() == idPersona).collect(Collectors.toList());
		return resultado;
	}

//	
	@Override
	public Persona findByid03(int idPersona) {
		List<Persona> lista = listAll();
		Persona p = new Persona();

		for (Persona persona : lista) {
			if (idPersona == persona.getId()) {
				p = persona;
			}
		}
		return p;
	}

	@Override
	public Persona findByid04(int idPersona) {
		List<Persona> lista = listAll();
		Persona p = new Persona();

		p = lista.stream().filter(c -> c.getId() == idPersona).findAny().orElse(null);

		return p;
	}

	@Override
	public List<Persona> listAllMap() {
//		https://mkyong.com/java8/java-8-filter-a-map-examples/
//		https://mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/?utm_source=mkyong.com&utm_medium=referral&utm_campaign=afterpost-related&utm_content=link0
		return null;
	}

}
