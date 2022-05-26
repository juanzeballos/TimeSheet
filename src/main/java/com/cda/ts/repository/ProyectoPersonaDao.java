package com.cda.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cda.ts.model.ProyectoPersona;

public interface ProyectoPersonaDao extends JpaRepository<ProyectoPersona, Long> {
	public List<ProyectoPersona> findByUsuario(String usuario);
	
	
	@Query(value = "SELECT   ppe.PPE_PROYECTO , ppe.PPE_PERSONA, ppe.PPE_FECHA_DESDE, ppe.PPE_FECHA_HASTA, ppe.PPE_TOTAL_HS_REALES, p.PRO_DESCRIPCION, p.PRO_ABREVIATURA, p.PRO_PERSONA_LIDER \r\n"
			+ "  FROM PROYECTOS_FASES_PERSONAS as ppe , ePM_PROYECTOS p\r\n"
			+ "  where PPE_PERSONA = ?1 AND p.PRO_CODIGO = ppe.PPE_PROYECTO and p.PRO_ESTADO = 37",
			nativeQuery = true)
	public List<Object[]> getProyectosByUsuario(@Param(value = "usuario") String usuario);
	
	@Query(value = "SELECT * FROM ProyectoPersona as pp  WHERE pp.usuario='jzeballos'", nativeQuery = true)
	public List<ProyectoPersona> getPP();
	
}
