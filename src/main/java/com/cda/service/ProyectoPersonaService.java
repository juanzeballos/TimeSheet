package com.cda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.model.Proyecto;
import com.cda.model.ProyectoPersona;
import com.cda.repository.ProyectoPersonaDao;

@Service
public class ProyectoPersonaService {
	@Autowired
	ProyectoPersonaDao proyectoPersonaDao;

	public List<ProyectoPersona> getProyectoPersona() {
		List<ProyectoPersona> pp = proyectoPersonaDao.findAll();

		return pp;
	}

	public List<Object[]> getProyectosByUsuario(String usuario) {
		List<Object[]> join = proyectoPersonaDao.getProyectosByUsuario(usuario);
		for (Object[] obj : join) {
			ProyectoPersona pp = (ProyectoPersona) obj[0];
			Proyecto proyecto = (Proyecto) obj[1];
		}
		return proyectoPersonaDao.getProyectosByUsuario(usuario);
	}

}
