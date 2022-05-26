package com.cda.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisponibilidadController {

	@GetMapping("p")
	    public String version() {
	        return "Hola Juan todo tranqui";
	    }

}
