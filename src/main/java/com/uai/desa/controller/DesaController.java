package com.uai.desa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesaController {

	@RequestMapping(value = "/")
	public String teste() {
		StringBuilder html = new StringBuilder();
		html.append("<h1>TP de Diseño y Arquitectura de Software</h1>");
		html.append("<ul><li>Christian Chamula</li>"); 
		html.append("<li>Lorena Fuentes</li>"); 
		html.append("<li>Lucas Freire</li>"); 
		html.append("<li>Mariano Bucher</li>"); 
		html.append("<li>Fernando Coronilla</li></ul>");  
			
		return html.toString();
	}

}
