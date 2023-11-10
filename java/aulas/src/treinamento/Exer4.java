package treinamento;

import java.util.Scanner;
import java.util.Random;

public class Exer4 {

	public static void main(String[] args) {
		/*
		 * Em um jogo de adivinhação, o jogador deve descobrir um número entre 1 e 10
		 * usando até três tentativas. A cada tentativa o jogador é informado se o
		 * número foi descoberto, ou se ele é maior ou menor do que a tentativa. Se após
		 * três tentativas o jogador não descobrir o número, então ele perde o jogo.
		 * Faça um algoritmo que i implemente esse jogo.
		 */

		Scanner ler = new Scanner(System.in);
		Random numeroAleatorio = new Random();
		int numero, numeroSorteado, tentativas = 0;

		
		numeroSorteado = numeroAleatorio.nextInt(10);
		if(numeroSorteado == 0){
			numeroSorteado ++;
		}
		
		System.out.println(numeroSorteado);

		System.out
				.println("ESTE É UM JOGO DE ADVINHAÇÃO, VOCÊ TEM TRÊS TENTATIVAS PARA ACERTAR UM NÚMERO ENTRE 1 E 10.");
		while(tentativas != 3) {
		System.out.print("\nDIGITE AQUI SEU NÚMERO DA SORTE: ");
		numero = ler.nextInt();
		
		if(numero < numeroSorteado) {
			System.out.println("O NÚMERO ESCOLHIDO É MENOR QUE O SORTEADO.");
		}else if (numero > numeroSorteado) {
			System.out.println("O NÚMERO ESCOLHIDO É MAIOR QUE O SORTEADO.");
		}else {
			System.out.println("\nVOCÊ ACERTOU! PARABÉNS!");
		}
		tentativas++;
		}
		
		System.out.println("\nSUAS TENTATIVAS FORAM ESGOTADAS. MAIS SORTE NA PROXIMA!");
	}

}
