package com.cda.ts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.ts.model.PersonasDisponibilidades;


public interface DisponibilidadDao extends JpaRepository<PersonasDisponibilidades, Long>{
	public PersonasDisponibilidades findByUsuario(String usuario);

}
