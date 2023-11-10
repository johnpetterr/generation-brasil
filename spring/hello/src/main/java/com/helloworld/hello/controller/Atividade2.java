package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atvd2")
public class Atividade2 {

	@GetMapping
	public String atividade2() {
		return "Os meus objetivos essa semana é estudar mais sobre API Rest e me familiarizar com o Spring";
	}
}
