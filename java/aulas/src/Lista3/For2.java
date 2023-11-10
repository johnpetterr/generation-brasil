package Lista3;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		/* Ler 10 numeros e imprimir quantos sao pares e quantos sao impares. */

		Scanner ler = new Scanner(System.in);

		int i, numeros, contadorPar = 0, contadorImpar = 0;

		int pares[] = new int[10], impares[] = new int[10];

		System.out.println("INFORME 10 NUMEROS");

		for (i = 0; i < 10; i++) {
			System.out.print("N" + (i + 1) + ": ");
			numeros = ler.nextInt();
			if (numeros % 2 == 0) {
				pares[i] = numeros;
			}

			if (numeros % 2 == 1) {
				impares[i] = numeros;
			}
		}

		System.out.printf("ESSES SAO OS NUMEROS PARES: ");
		for (i = 0; i < 10; i++) {
			if (pares[i] != 0) {
				System.out.print(pares[i] + " ");
				contadorPar++;
			}
		}
		System.out.printf("\nQUANTIDADE DE NUMEROS PARES: %d", contadorPar);

		System.out.println();

		System.out.printf("\nESSES SAO OS NUMEROS IMPARES: ");
		for (i = 0; i < 10; i++) {
			if (impares[i] != 0) {
				System.out.print(impares[i] + " ");
				contadorImpar++;
			}
		}
		System.out.printf("\nQUANTIDADE DE NUMEROS IMPARES: %d", contadorImpar);

		ler.close();
	}

}