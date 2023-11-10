package Lista3;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracteristicas
		 * psicologicas dos individuos de uma regiao. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opçoes (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: - o numero de pessoas calmas; - o numero de
		 * mulheres nervosas; - o numero de homens agressivos; - o numero de outros
		 * calmos; - o numero de pessoas nervosas com mais de 40 anos; - o numero de
		 * pessoas calmas com menos de 18 anos.
		 */

		Scanner ler = new Scanner(System.in);

		// VARIAVEIS
		int idade, pessoas = 0, contadorCalmas18Anos = 0, contadorPessoasCalmas = 0, contadorMulheresNervosas = 0,
				contadorHomensAgressivos = 0, contadorOutrosCalmos = 0, contadorNervosas40Anos = 0;
		char sexo, opcoes, op = 'S';

		// ENTRADAS
		while (pessoas < 3 && (op == 'S' || op == 's')) {
			System.out.print("\nDIGITE A SUA IDADE: ");
			idade = ler.nextInt();

			System.out.print("\nINFORME O SEXO: \n1- FEMININO \n2- MASCULINO \n3- OUTROS \nDIGITE AQUI: ");
			sexo = ler.next().charAt(0);

			System.out.print("\nINFORME O SEU EMOCIONAL: \n1- PESSOA CALMA \n2- PESSOA NERVOSA \n3- AGRESSIVA \nDIGITE AQUI: ");
			opcoes = ler.next().charAt(0);

			System.out.print("DESEJA CONTINUAR? (S/N): ");
			op = ler.next().charAt(0);

			pessoas++;

			if (opcoes == '1') {
				contadorPessoasCalmas++;
			}

			if (sexo == '1' && opcoes == '2') {
				contadorMulheresNervosas++;
			}

			if (sexo == '2' && opcoes == '3') {
				contadorHomensAgressivos++;
			}

			if (sexo == '3' && opcoes == '1') {
				contadorOutrosCalmos++;
			}

			if (idade > 40 && opcoes == '2') {
				contadorNervosas40Anos++;
			}

			if (idade < 18 && opcoes == '2') {
				contadorCalmas18Anos++;
			}
		}
		
		//RESULTADOS
		System.out.printf("\nO NUMERO DE PESSOAS CALMAS: %d", contadorPessoasCalmas);
		System.out.printf("\nO NUMERO DE MULHERES NERVOSAS: %d", contadorMulheresNervosas);
		System.out.printf("\nO NUMERO DE HOMENS AGRESSIVOS: %d", contadorHomensAgressivos);
		System.out.printf("\nO NUMERO DE OUTROS CALMOS: %d", contadorOutrosCalmos);
		System.out.printf("\nO NUMERO DE PESSOAS NERVOSAS ACIMA DE 40 ANOS: %d", contadorNervosas40Anos);
		System.out.printf("\nO NUMERO DE PESSOAS CALMAS ABAIXO DE 18 ANOS: %d", contadorCalmas18Anos);

		// SAIDAS
		ler.close();
	}
}
