package com.cda.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.ts.model.PersonasDisponibilidades;
import com.cda.ts.repository.DisponibilidadDao;

@Service
public class DisponibilidadesService {
	@Autowired
	DisponibilidadDao dDao;
	
	public List<PersonasDisponibilidades> getDisponibilidad(String usuario) {
		return dDao.findByUsuario(usuario);
	}
	
}
