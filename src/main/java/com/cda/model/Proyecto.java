package com.cda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ePM_PROYECTOS")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "PRO_CODIGO")
	private String codigo;

	@Column(name = "PRO_DESCRIPCION")
	private String descripcion;

	@Column(name = "PRO_ABREVIATURA")
	private String abreviatura;

	@Column(name = "PRO_PERSONA_LIDER")
	private String liderProyecto;

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
