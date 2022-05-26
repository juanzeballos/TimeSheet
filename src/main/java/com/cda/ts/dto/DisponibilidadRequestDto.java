package com.cda.ts.dto;

public class DisponibilidadRequestDto {
	private String codigo;

	public DisponibilidadRequestDto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String ternro) {
		this.codigo = ternro;
	}

}
