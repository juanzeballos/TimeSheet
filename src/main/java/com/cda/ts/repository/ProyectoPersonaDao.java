package com.cda.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cda.ts.model.ProyectoPersona;

public interface ProyectoPersonaDao extends JpaRepository<ProyectoPersona, Long> {
	public List<ProyectoPersona> findByUsuario(String usuario);
	
	
	@Query(value = "SELECT   ppe.PPE_PROYECTO , p.PRO_DESCRIPCION, ppe.PPE_PERSONA,  ppe.PPE_TOTAL_HS_REALES,"
			+ " p.PRO_PERSONA_LIDER, p.PRO_ABREVIATURA, p.PRO_EMPRESA_PRINCIPAL \r\n"
			+ "  FROM PROYECTOS_FASES_PERSONAS as ppe , ePM_PROYECTOS p\r\n"
			+ "  where PPE_PERSONA = ?1 AND p.PRO_CODIGO = ppe.PPE_PROYECTO and p.PRO_ESTADO = 37",
			nativeQuery = true)
	public List<Object[]> getProyectosByUsuario(@Param(value = "usuario") String usuario);
	
	@Query(value = "SELECT * FROM PROYECTOS_FASES_PERSONAS as pp  WHERE pp.usuario='jzeballos'", nativeQuery = true)
	public List<ProyectoPersona> getPP();
	
	
	@Query(value = "SELECT   p.PFA_CODIGO , p.PFA_DESCRIPCION, tp.TFA_DESCRIPCION \r\n"
			+ "  FROM PROYECTOS_FASES as p , TIPOS_FASES tp \r\n"
			+ "  where p.PFA_PROYECTO = ?1 AND p.PFA_TIPO_FASE = tp.TFA_CODIGO",
			nativeQuery = true)
	public List<Object[]> getFaseByProyecto(@Param(value = "proyecto") String proyecto);
	
	@Query(value = "SELECT e.EMP_DESCRIPCION "
			+ "  FROM EMPRESAS as e  "
			+ "  where e.EMP_CODIGO = ?1 ",
			nativeQuery = true)
	public String getCliente(@Param(value = "cliente") String cliente);
	
}
