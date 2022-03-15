package com.corso.java.demo.service;

import java.util.List;

import com.corso.java.demo.model.Persona;

public interface PersonaService {

	public List<Persona> selectAll();
	
	public Persona getPersona(Long id);
	
	public void addPersona(Persona nuovaP);
	
	public List<Persona> listaFiltroNc(String nome,String cognome);
	
	public List<Persona> listaFiltroId(Long n1,Long n2);
	
}
