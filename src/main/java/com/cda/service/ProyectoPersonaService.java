package com.cda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cda.model.ProyectoPersona;
import com.cda.repository.ProyectoPersonaDao;

public class ProyectoPersonaService {
	@Autowired
	ProyectoPersonaDao proyectoPersonaDao;

	public List<ProyectoPersona> getProyectoPersona() {
		List<ProyectoPersona> pp = proyectoPersonaDao.findAll();

		return pp;
	}
	public List<Object[]> getProyectosByUsuario(String usuario) {
	return proyectoPersonaDao.getProyectosByUsuario(usuario);
	}

}
