package treinamento;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		/*Modifique o algoritmo da questão 2 para que o usuário possa escolher, usando o teclado, se quer mostrar números pares ou ímpares. */

		Scanner ler = new Scanner(System.in);
		int numero, contador = -1, i;
		char op;
		
		System.out.print("INFORME UM NUMERO: ");
		numero = ler.nextInt();
		System.out.print("VOCÊ DESEJA NUMEROS PARES OU IMPARES? [P/I]: ");
		op = ler.next().toUpperCase().charAt(0);
		
		if(op == 'P') {
			for(i = 0; i <= numero; i++) {
				contador++;
				if(contador % 2 == 0) {
					System.out.println(contador);
				}
			}
		}else if(op == 'I') {
			for(i = 0; i <= numero; i++) {
				contador++;
				if(contador % 2 == 1) {
					System.out.println(contador);
				}
			}
		}else {
			System.out.println("OPÇÃO INVÁLIDA.");
		}
	}

}
