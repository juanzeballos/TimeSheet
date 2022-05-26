package com.cda.ts.dto;

import java.util.List;

public class PPJsonDto {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private List<PPDto> data;
	private InfoDto info;

	public HeaderDto getHeader() {
		return header;
	}

	public void setHeader(HeaderDto header) {
		this.header = header;
	}

	public List<PPDto> getData() {
		return data;
	}

	public void setData(List<PPDto> data) {
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
