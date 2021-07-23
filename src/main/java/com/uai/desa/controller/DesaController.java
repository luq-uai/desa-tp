package com.uai.desa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesaController {

	@RequestMapping(value = "/")
	public String teste() {
		
		String html = "<h1>TP de Diseño y Arquitectura de Software</h1>";
		html = html + "<h2>Lucas Freire</h2>;
			
		return html;
	}

}
