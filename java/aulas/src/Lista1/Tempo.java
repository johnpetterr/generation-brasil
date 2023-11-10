package Lista1;

import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duraçãoo de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, horas, minutos, segundos1;
		
		System.out.print("Já se passaram quanto tempo em SEGUNDOS de eventos? : ");
		segundos = ler.nextInt();
		
		minutos = segundos / 60;
		horas = segundos / 3600;
		segundos1 = (segundos % 3600) % 60;
		
		System.out.print("\nO evento tem dura��o de: ");
		System.out.print(minutos + " minuto(s). \n");
		System.out.print(horas + " hora(s). \n");
		System.out.print("e "+ segundos +" segundo(s).");
	}
	
}