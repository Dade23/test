package com.corso.java.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.java.demo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

	@Query(nativeQuery = true, value = "SELECT * FROM persone WHERE persone.nome=?1 AND persone.cognome=?2")
	List<Persona> filtroNc(String nome,String cognome);
	
	@Query(nativeQuery = true, value = "SELECT * FROM persone WHERE persone.id=?1 AND persone.id=?2")
	List<Persona> filtroId(Long n1,Long n2);
	
	
}
