package Lista3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.
		 */

		Scanner ler = new Scanner(System.in);

		int numero, somador = 0;

		do {
			System.out.print("INFORME UM NÚMERO: ");
			numero = ler.nextInt();
			somador += numero;
		} while (numero > 0);

		System.out.println("PROGRAMA ENCERRADO!");
		System.out.printf("\nA SOMA DOS NÚMEROS DIGITADOS SÃO DE: %d", somador);
	}

}
