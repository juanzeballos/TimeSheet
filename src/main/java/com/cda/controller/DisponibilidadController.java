package com.cda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cda.dto.DisponibilidadJsonDto;
import com.cda.dto.InfoDto;
import com.cda.dto.RequestDisponibilidadJsonDto;
import com.cda.enumm.CodigosEstadoEnum;
import com.cda.service.DisponibilidadService;

public class DisponibilidadController {
	DisponibilidadService disponibilidadService;

	@PostMapping("getDisponibilidad")
	public ResponseEntity<DisponibilidadJsonDto> getDisponibilidadByCodigo(
			@RequestBody RequestDisponibilidadJsonDto json) {
		DisponibilidadJsonDto usuarioJson = new DisponibilidadJsonDto();
		InfoDto responseInfo = new InfoDto("success", String.valueOf(CodigosEstadoEnum.OK.getCodigo()));
		try {
			usuarioJson.setHeader(json.getHeader());
			usuarioJson.setData(disponibilidadService.getDisponibilidadByCodigo(json.getData().getCodigo()));
			usuarioJson.setInfo(responseInfo);

		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().body(usuarioJson);
	}

}
