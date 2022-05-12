package com.cda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISPONIBILIDADES")
public class Disponibilidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ESD_CODIGO")
	private String codigo;
	@Column(name = "ESD_DESCRIPCION")
	private String descripcion;
	@Column(name = "ESD_HS_POR_SEMANA_DISP")
	private String horas;
	@Column(name = "ESD_HS_POR_SEMANA_MAX")
	private String maxHoras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getMaxHoras() {
		return maxHoras;
	}

	public void setMaxHoras(String maxHoras) {
		this.maxHoras = maxHoras;
	}

}
