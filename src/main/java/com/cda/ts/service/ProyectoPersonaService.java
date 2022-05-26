package com.cda.ts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.ts.dto.PPDto;
import com.cda.ts.repository.ProyectoDao;
import com.cda.ts.repository.ProyectoPersonaDao;

@Service
public class ProyectoPersonaService {
	@Autowired
	ProyectoPersonaDao proyectoPersonaDao;
	@Autowired
	ProyectoDao proyectoDao;
	List<PPDto> ppdtoList;
	PPDto ppdto;
	public List<PPDto> getProyectoPersona(String nombre) {
		List<PPDto> ppdtoList = new ArrayList<PPDto>();
		 List<Object[]> pp = proyectoPersonaDao.getProyectosByUsuario(nombre);
		for (Object[] objects : pp) {
			PPDto ppdto = new PPDto();
			ppdto.setCodigo(objects[0].toString());
			ppdto.setUsuario(objects[1].toString());
			ppdto.setFechaDesde(objects[2] == null ? null : objects[2].toString());
			ppdto.setFechaHasta(objects[3] == null ? null : objects[3].toString());
			ppdto.setHorasTotales(objects[4].toString());
			ppdto.setDescripcion(objects[5].toString());
			ppdto.setAbreviatura(objects[6].toString());
			ppdto.setLiderProyecto(objects[7].toString());
			ppdtoList.add(ppdto);
		}
		return ppdtoList;
	}



}
