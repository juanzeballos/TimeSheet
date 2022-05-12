package com.cda.dto;

import com.cda.model.Disponibilidad;

public class DisponibilidadJsonDto {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private Disponibilidad data;
	private InfoDto info;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public HeaderDto getHeader() {
		return header;
	}

	public void setHeader(HeaderDto header) {
		this.header = header;
	}

	public Disponibilidad getData() {
		return data;
	}

	public void setData(Disponibilidad usuarioDto) {
		this.data = usuarioDto;
	}

	public InfoDto getInfo() {
		return info;
	}

	public void setInfo(InfoDto info) {
		this.info = info;
	}

}
