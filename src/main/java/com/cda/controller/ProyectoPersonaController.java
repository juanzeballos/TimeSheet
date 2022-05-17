package com.cda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cda.dto.InfoDto;
import com.cda.dto.PPJsonDto;
import com.cda.dto.RequestPPJsonDto;
import com.cda.enumm.CodigosEstadoEnum;
import com.cda.model.ProyectoPersona;
import com.cda.service.ProyectoPersonaService;

@RestController
public class ProyectoPersonaController {
	ProyectoPersonaService proyectoPersonaService;

	@GetMapping("getProyectosByUsuario")
	public List<Object[]> getProyectosByUsuario(String usuario) {
		return proyectoPersonaService.getProyectosByUsuario(usuario);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<ProyectoPersona> getProyecto() {
		return proyectoPersonaService.getProyectoPersona();
	}

	@GetMapping("getProyectosByUsuario")
	public ResponseEntity<PPJsonDto> getDisponibilidadByCodigo(@RequestBody RequestPPJsonDto json) {
		PPJsonDto ppJson = new PPJsonDto();
		InfoDto responseInfo = new InfoDto("success", String.valueOf(CodigosEstadoEnum.OK.getCodigo()));
		try {
			ppJson.setHeader(json.getHeader());
			ppJson.setData(proyectoPersonaService.getProyectosByUsuario(json.getData().getUsuario()));
			ppJson.setInfo(responseInfo);

		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().body(ppJson);
	}

}
