package com.db1start.cidadesapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {

	
	
	@GetMapping("/estados")
	public String buscarTodosOsEstados() {	
		return ("todos os estados");
	}
}
