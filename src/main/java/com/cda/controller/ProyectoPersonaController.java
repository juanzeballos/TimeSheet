package com.cda.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.cda.model.ProyectoPersona;
import com.cda.service.ProyectoPersonaService;

public class ProyectoPersonaController {
	ProyectoPersonaService proyectoPersonaService;

	@GetMapping("getProyectoPersona")
	public List<ProyectoPersona> getProyecto() {
		return proyectoPersonaService.getProyectoPersona();
	}
	

}
