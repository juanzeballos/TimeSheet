package com.cda.ts.dto;

import java.io.Serializable;

public class RequestStringJsonDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private PPRequestDto data;
	private InfoDto info;

	public RequestStringJsonDto() {
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

	public PPRequestDto getData() {
		return data;
	}

	public void setData(PPRequestDto data) {
		this.data = data;
	}

	public InfoDto getInfo() {
		return info;
	}

	public void setInfo(InfoDto info) {
		this.info = info;

	}
}
