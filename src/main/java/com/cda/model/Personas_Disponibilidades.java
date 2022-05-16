package com.cda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.PERSONAS_DISPONIBILIDADES")
public class Personas_Disponibilidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "PER_CODIGO", referencedColumnName = "usuario")
	@Column(name = "PDI_PERSONA")
	private Persona usuario;
	
	@ManyToOne
	@JoinColumn(name = "ESD_CODIGO", referencedColumnName = "codigo")
	private Disponibilidad codigoDisponibilidad;
	
	@Column(name = "PDI_CALENDARIO")
	private String calendario;

}
