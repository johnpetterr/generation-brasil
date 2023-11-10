package Lista1;

import java.util.Scanner;

public class Idade2 {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		Scanner ler = new Scanner(System.in);
		
		int diasV, meses, anos, dias, idade;
		
		System.out.print("Digite a quantidade de dias: ");
		diasV = ler.nextInt();
		
		anos = diasV / 365;
		meses = (diasV % 365) / 30;
		dias =  (diasV % 365) - 30;
		idade = 2021 - anos;
		
		System.out.println("\nO mês da sua idade é: "+ meses +".");
		System.out.println("O ano da sua idade é: "+ anos +".");
		System.out.println("O dia em que você nasceu é: "+ dias +".");
		System.out.println("Você tem "+ idade +" anos.");
	}
	
}