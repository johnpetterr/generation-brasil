package Lista3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de varias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99.
		 */

		Scanner ler = new Scanner(System.in);

		int idade, contador21 = 0, contador50 = 0;

		System.out.print("DIGITE SUA IDADE: ");
		idade = ler.nextInt();

		while (idade > -99) {
			System.out.print("DIGITE SUA IDADE: ");
			idade = ler.nextInt();
			if (idade > -99) {
				contador21++;
			} else if (idade == -99) {
				contador21 -= 1;
			}
			if (idade > 50) {
				contador50++;
			}
		}
		System.out.println("PROGRAMA ENCERRADO!");
		System.out.printf("\nTOTAL DE PESSOAS COM MENOS DE 21 ANOS: %d", contador21);
		System.out.printf("\nTOTAL DE PESSOAS COM MAIS DE 50 ANOS: %d", contador50);

	}

}