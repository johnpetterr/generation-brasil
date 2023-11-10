package treinamento;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		/*Use a estrutura de repetição enquanto condição faça para mostrar uma contagem de números pares na tela. Essa contagem deve iniciar em 0 e terminar com um número previamente informed pelo teclado. */

		Scanner ler = new Scanner(System.in);
		int numero, contador = -1;
		
		System.out.print("INFORME UM NUMERO: ");
		numero = ler.nextInt();
		while(contador != numero) {
			contador++;
			if(contador % 2 == 0) {
				System.out.println(contador);
			}
		}
	}

}
