package treinamento;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		/*Resolva o exercício 1 novamente, porém desta vez usando uma estrutura de repetição para. */
		
		Scanner ler = new Scanner(System.in);
		int numero, contador = -1;
		
		System.out.print("INFORME UM NUMERO: ");
		numero = ler.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			contador++;
			if(contador % 2 == 0) {
				System.out.println(contador);
			}
		}

	}

}
