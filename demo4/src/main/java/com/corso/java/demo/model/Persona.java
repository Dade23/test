package com.corso.java.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="persone")
public class Persona {

	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	private int eta;
	
	
	public Persona() {
		
	}


	public Persona(Long id,String nome, String cognome, int eta) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}


	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
}
