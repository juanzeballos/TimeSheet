package com.cda.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.ts.model.PersonasDisponibilidades;


public interface DisponibilidadDao extends JpaRepository<PersonasDisponibilidades, Long>{
	public List<PersonasDisponibilidades> findByUsuario(String usuario);

}
