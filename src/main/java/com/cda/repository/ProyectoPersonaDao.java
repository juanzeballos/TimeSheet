package com.cda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cda.model.ProyectoPersona;

public interface ProyectoPersonaDao extends JpaRepository<ProyectoPersona, String> {
	public List<ProyectoPersona> findAll();
	
	
	@Query(value = "SELECT * FROM ProyectoPersona as pp INNER JOIN pp.claveProyecto as p"
			+ "where pp.usuario=:usuario", nativeQuery = true)
	public List<Object[]> getProyectosByUsuario(@Param(value = "usuario") String usuario);

}
