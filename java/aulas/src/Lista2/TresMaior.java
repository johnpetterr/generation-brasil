package Lista2;

import java.util.Scanner;

public class TresMaior {
	
	public static void main(String[] args) {
		
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("INFORME TRÊS NÚMEROS: ");
		System.out.printf("N - 1: ");
		numero1 = ler.nextInt();
		System.out.printf("N - 2: ");
		numero2 = ler.nextInt();
		System.out.printf("N - 3: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2) {
			if(numero1 > numero3) {
				System.out.printf("%d é o maior número.", numero1);
			}
		}else if(numero2 > numero3) {
			if(numero2 > numero1) {
				System.out.printf("%d é o maior número.", numero2);
			}
		}else if(numero3> numero1){
			if(numero3 > numero2) {
				System.out.printf("%d é o maior número.", numero3);
			}
		}else {
			System.out.println("Todos os números são iguais.");
		}
	}

}