package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atvd1")
public class Atividade1 {
	
	@GetMapping
	public String atividade1() {
		return "As habilidades usadas para desenvolver foram: Atenção aos Detalhes. E as mentalidades: Persistência e Mentalidade de Crescimento.";
	}

}
