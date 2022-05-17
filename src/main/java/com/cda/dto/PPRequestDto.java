package com.cda.dto;

public class PPRequestDto {

	private String usuario;

	public PPRequestDto() {}
	
	public PPRequestDto(String usuario) {
		super();
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
