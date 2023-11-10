package com.helloworld.hello.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String calculadora() {
		Scanner ler = new Scanner(System.in);
		int numA, numB, soma, subtr, divisao, multi;
		
		System.out.print("Insira o número A: ");
		numA = ler.nextInt();
		
		System.out.print("Insira o número B: ");
		numB = ler.nextInt();
		
		soma = numA + numB;
		subtr = numA - numB;
		divisao = numA / numB;
		multi = numA * numB;
		
		return "Hello World! -> A soma: "+ soma + ". A subtração: " + subtr + ". A divisão: "+ divisao + ". A multiplicação: "+ multi + ".";
	}
}
