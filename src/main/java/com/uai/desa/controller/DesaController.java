package com.uai.desa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesaController {

	@RequestMapping(value = "/")
	public String teste() {
		return "Hello World";
	}

}
