package com.cda.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cda.ts.dto.DisponibilidadJsonDto;
import com.cda.ts.dto.InfoDto;
import com.cda.ts.dto.RequestStringJsonDto;
import com.cda.ts.enumm.CodigosEstadoEnum;
import com.cda.ts.model.PersonasDisponibilidades;
import com.cda.ts.service.DisponibilidadesService;

@RestController
public class DisponibilidadController {
	@Autowired
	DisponibilidadesService disponibilidadS;

	@GetMapping("p")
	public String version() {
		return "Hola Juan todo tranqui";
	}

	@GetMapping("getDisponibilidad/{usuario}")
	public List<PersonasDisponibilidades> test(@PathVariable String usuario ) {
		return disponibilidadS.getDisponibilidad(usuario);
	}

	@GetMapping("disponibilidadByUsuario")
	public ResponseEntity<DisponibilidadJsonDto> proyectoByUsuario(@RequestBody RequestStringJsonDto json) {
		DisponibilidadJsonDto jsonDto = new DisponibilidadJsonDto();
		InfoDto responseInfo = new InfoDto("success", String.valueOf(CodigosEstadoEnum.OK.getCodigo()));
		try {
			jsonDto.setHeader(json.getHeader());
			jsonDto.setData(disponibilidadS.getDisponibilidad(json.getData().getUsuario()));
			jsonDto.setInfo(responseInfo);

		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().body(jsonDto);
	}
}
