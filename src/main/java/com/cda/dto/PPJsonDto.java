package com.cda.dto;

import java.util.List;

public class PPJsonDto {
	private static final long serialVersionUID = 1L;

	private HeaderDto header;
	private List<Object[]> data;
	private InfoDto info;

	public HeaderDto getHeader() {
		return header;
	}

	public void setHeader(HeaderDto header) {
		this.header = header;
	}

	public List<Object[]> getData() {
		return data;
	}

	public void setData(List<Object[]> data) {
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
