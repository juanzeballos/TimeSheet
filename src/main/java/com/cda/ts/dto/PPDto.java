package com.cda.ts.dto;

public class PPDto {
	private String codigo;
	private String usuario;
	private String fechaDesde;
	private String fechaHasta;
	private String horasTotales;
	private String descripcion;
	private String abreviatura;
	private String liderProyecto;
	
	public PPDto() {
		super();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public String getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public String getHorasTotales() {
		return horasTotales;
	}
	public void setHorasTotales(String horasTotales) {
		this.horasTotales = horasTotales;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getLiderProyecto() {
		return liderProyecto;
	}
	public void setLiderProyecto(String liderProyecto) {
		this.liderProyecto = liderProyecto;
	}

}
