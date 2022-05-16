package com.cda.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cda.model.ProyectoPersona;
import com.cda.service.ProyectoPersonaService;

public class ProyectoPersonaController {
	ProyectoPersonaService proyectoPersonaService;
//
//	@GetMapping("getProyectoPersona")
//	public List<ProyectoPersona> getProyecto() {
//		return proyectoPersonaService.getProyectoPersona();
//	}
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public List<ProyectoPersona>  getProyecto()  {
		 return proyectoPersonaService.getProyectoPersona();
	    }
	

}
