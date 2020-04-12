package com.example.test;

import com.example.repository.PersonaRepositoryImpl;

public class Test01 {

	public static void main(String[] args) {

		PersonaRepositoryImpl repo = new PersonaRepositoryImpl();
		repo.findByid(3);

	}

}
