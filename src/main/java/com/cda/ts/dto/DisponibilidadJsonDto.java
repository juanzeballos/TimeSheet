package com.cda.ts.dto;

import java.util.List;

import com.cda.ts.model.PersonasDisponibilidades;

public class DisponibilidadJsonDto {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private List<PersonasDisponibilidades> data;
	private InfoDto info;

	public HeaderDto getHeader() {
		return header;
	}

	public void setHeader(HeaderDto header) {
		this.header = header;
	}

	public List<PersonasDisponibilidades> getData() {
		return data;
	}

	public void setData(List<PersonasDisponibilidades> data) {
		this.data = data;
	}

	public InfoDto getInfo() {
		return info;
	}

	public void setInfo(InfoDto info) {
		this.info = info;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
