package com.cda.dto;

import java.io.Serializable;

public class RequestDisponibilidadJsonDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private DisponibilidadRequestDto data;
	private InfoDto info;

	public RequestDisponibilidadJsonDto() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public HeaderDto getHeader() {
		return header;
	}

	public void setHeader(HeaderDto header) {
		this.header = header;
	}

	public DisponibilidadRequestDto getData() {
		return data;
	}

	public void setData(DisponibilidadRequestDto data) {
		this.data = data;
	}

	public InfoDto getInfo() {
		return info;
	}

	public void setInfo(InfoDto info) {
		this.info = info;
	}
}
