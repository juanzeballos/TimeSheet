package com.cda.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cda.ts.model.ProyectoPersona;

public interface ProyectoPersonaDao extends JpaRepository<ProyectoPersona, Long> {

    public List<ProyectoPersona> findByUsuario(String usuario);

	@Query(value = "SELECT PPE_PROYECTO, PRO_DESCRIPCION, PPE_PERSONA,  PPE_TOTAL_HS_REALES, PRO_PERSONA_LIDER, PRO_ABREVIATURA, PRO_EMPRESA_PRINCIPAL \r\n"
			+ " from PROYECTOS_FASES_PERSONAS inner join PROYECTOS_FASES on PPE_PROYECTO=PFA_PROYECTO and PPE_FASE=PFA_CODIGO inner join ESTADOS_FASES on PFA_ESTADO=ESF_CODIGO inner join ePM_PROYECTOS on PPE_PROYECTO=PRO_CODIGO inner join ESTADOS_PROYECTOS on PRO_ESTADO=ETP_CODIGO inner join PROGRAMAS on PRO_PROGRAMA=PRG_CODIGO inner join PERSONAS_SISTEMAS on PPE_PERSONA=PSI_PERSONA and PSI_SISTEMA=1001 inner join PERSONAS on PSI_PERSONA=PER_CODIGO "
			+ "  where ETP_UTILIZA_TIMESHEET='S' and ESF_USA_TIMESHEET='S' and PPE_ACTIVO='S' and PSI_USA_TIMESHEET='S'    and  PSI_ACTIVO='S' and PPE_PERSONA  = ?1"
			+ "order by ppe.PPE_PROYECTO DESC",
			nativeQuery = true)
	public List<Object[]> getProyectosByUsuario(@Param(value = "usuario") String usuario);

    @Query(value = "SELECT   ppe.PPE_PROYECTO , p.PRO_DESCRIPCION, ppe.PPE_PERSONA,  ppe.PPE_TOTAL_HS_REALES, p.PRO_PERSONA_LIDER, p.PRO_ABREVIATURA, p.PRO_EMPRESA_PRINCIPAL, p.PRO_TIPO_PROYECTO "
        + "FROM PROYECTOS_FASES_PERSONAS as ppe , ePM_PROYECTOS p "
        + "where p.PRO_DESCRIPCION LIKE '[[]NP]%' AND ppe.PPE_PERSONA = ?1 AND p.PRO_CODIGO = ppe.PPE_PROYECTO and p.PRO_ESTADO = 37 order by ppe.PPE_PROYECTO DESC",	
        nativeQuery  = true)
   	public List<Object[]> getLicencia(@Param(value = "usuario") String usuario);     
	
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
