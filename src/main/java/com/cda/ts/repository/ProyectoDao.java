package com.cda.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.ts.model.Proyecto;

public interface ProyectoDao extends JpaRepository<Proyecto, Long> {

	public List<Proyecto> findAll();
	
	public List<Proyecto> findByCodigo(Long codigo);

}
