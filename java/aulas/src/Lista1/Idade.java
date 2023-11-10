package Lista1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, idadeD, idadeM, idadeT;
		
		System.out.println("INFORME A SUA IDADE:");
		System.out.print("Ano: ");
		anos = ler.nextInt();
		System.out.print("Mês: ");
		meses = ler.nextInt();
		System.out.print("Dia: ");
		dias = ler.nextInt();
		
		idadeD = anos * 365;
		idadeM = meses * 30;
		idadeT = idadeD + idadeM + dias;
		
		System.out.println();
		System.out.println("Sua idade em dias é de: "+ idadeT +" dias.");
		
		
	}
	
}