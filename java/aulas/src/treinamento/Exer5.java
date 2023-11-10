package treinamento;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		/* Faça um algoritmo para calcular a média de 4 notas de um aluno, porém desprezando a menor nota.*/
		Scanner ler = new Scanner(System.in);
		int notas[] = new int[4], contador = 0;
		double media = 0.0;
		
		System.out.print("INFORME SUA PRIMEIRA NOTA: ");
		notas[0] = ler.nextInt();
		System.out.print("INFORME SUA SEGUNDA NOTA : ");
		notas[1] = ler.nextInt();
		System.out.print("INFORME SUA TERCEIRA NOTA: ");
		notas[2] = ler.nextInt();
		System.out.print("INFORME SUA QUARTA NOTA  : ");
		notas[3] = ler.nextInt();
		
		for(int i = 0; i < 4; i++) {
			contador += notas[i];
			media = contador / 4;
		}
		System.out.printf("\nMÉDIA: %.1f", media);
	}

}
