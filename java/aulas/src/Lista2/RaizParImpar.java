package Lista2;

import java.util.Scanner;

public class RaizParImpar {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		
		if(numero < 0) {
			System.out.println("Números negativos não podem ser números pares e ímpares.");
			
		}else if(numero == 0) {
			System.out.println("Zero é neutro.");
			
		}else if(numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.print("O número é par e foi calculado a sua raiz.");
			System.out.printf("\nNúmero: %.2f ", numero);
			
		}else if (numero % 2 == 1) {
			numero = Math.pow(numero, 2.0);
			System.out.print("O número é ímpar e foi calculado a sua potencialização.");
			System.out.printf("\nNúmero: %.0f ", numero);
			
		}
	}
}