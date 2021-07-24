package com.uai.desa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesaController {

	@RequestMapping(value = "/")
	public String teste() {
		StringBuilder html = new StringBuilder();
		html.append("<h1>TP de Diseño y Arquitectura de Software</h1>");
		html.append("<h2>Christian Chamula</h2>"); 
		html.append("<h2>Lorena Fuentes</h2>"); 
		html.append("<h2>Lucas Freire</h2>"); 
		html.append("<h2>Mariano Bucher</h2>"); 
		html.append("<h2>Fernando Coronilla</h2>");  
			
		return html.toString();
	}

}
