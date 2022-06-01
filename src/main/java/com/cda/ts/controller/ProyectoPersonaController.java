package com.cda.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cda.ts.dto.InfoDto;
import com.cda.ts.dto.PPDto;
import com.cda.ts.dto.PPJsonDto;
import com.cda.ts.dto.RequestStringJsonDto;
import com.cda.ts.enumm.CodigosEstadoEnum;
import com.cda.ts.model.ProyectoPersona;
import com.cda.ts.service.ProyectoPersonaService;

@RestController
public class ProyectoPersonaController {
	@Autowired
	ProyectoPersonaService pps;

	@GetMapping("getHola")
	public String versiones() {
		return "Hola todo tranqui";
	}

	@GetMapping("getP")
	public List<ProyectoPersona> test() {
		return pps.getP();
	}

	@GetMapping("proyectoByUsuario/{usuario}")
	public List<PPDto> proyectoByUsuario(@PathVariable String usuario) {

		return pps.getProyectoPersona(usuario);

	}
}
