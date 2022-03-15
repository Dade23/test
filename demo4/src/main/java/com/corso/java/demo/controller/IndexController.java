package com.corso.java.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corso.java.demo.model.Persona;
import com.corso.java.demo.service.*;
@RestController
@RequestMapping("/test")
public class IndexController {

@Autowired
private PersonaServiceImpl personaService;
	
@GetMapping("/persone")
public List<Persona> getAllPersone(){
	return personaService.selectAll();
}

@GetMapping(value = "/cerca/{id}")
public Persona getPersona(@PathVariable Long id){
	return personaService.getPersona(id);
}
	
@PostMapping(value = "/addPersona")
public void addPersona(@RequestBody Persona nuovaP) {
	personaService.addPersona(nuovaP);
}

@GetMapping(value = "/cercaNomeCognome/{nome}/{cognome}")
public List<Persona> listaNd(@PathVariable String nome,@PathVariable String cognome){
	return personaService.listaFiltroNc(nome, cognome);
}


@GetMapping(value = "/cercaId/{n1}/{n2}")
public List<Persona> listaId(@PathVariable Long n1,@PathVariable Long n2){
	return personaService.listaFiltroId(n1, n2);
}

	
}
