package com.cda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.model.Disponibilidad;

public interface DisponibilidadDao extends JpaRepository<Disponibilidad, String>{
//	public Disponibilidad getDisponibilidadByCodigo(String legajo);
}
