package com.corso.java.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corso.java.demo.model.Persona;
import com.corso.java.demo.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	
	@Autowired
	PersonaRepository personaRepository;
	
	@Override
	public List<Persona> selectAll(){
		return personaRepository.findAll();
	}
	
	@Override
	public Persona getPersona(Long id) {
		List<Persona> persone = new ArrayList<Persona>();
		persone = personaRepository.findAll();
		return persone.stream().filter(p -> p.getId() == id).findFirst().get();
	}
	
	@Override
	public void addPersona(Persona nuovaP) {
		personaRepository.save(nuovaP);
	}
	
    @Override
    public List<Persona> listaFiltroNc(String nome,String cognome){
    	return personaRepository.filtroNc(nome,cognome);
    }
	
    @Override
    public List<Persona> listaFiltroId(Long n1,Long n2){
    	return personaRepository.filtroId(n1,n2);
    }
	

}
