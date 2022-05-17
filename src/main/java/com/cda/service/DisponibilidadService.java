package com.cda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.model.Disponibilidad;
import com.cda.repository.DisponibilidadDao;
@Service
public class DisponibilidadService {
	@Autowired
	DisponibilidadDao disponibilidadDao;
	
	public Disponibilidad getDisponibilidadByCodigo(String codigo) {
//		Disponibilidad disponibilidad = disponibilidadDao.getDisponibilidadByCodigo(codigo);
		
		return null;
	}
}
