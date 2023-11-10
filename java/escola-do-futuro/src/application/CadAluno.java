package application;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] alunes = { "Ana Beatriz Yujra Espejo", "Ana Carolina G. de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe C. de Souza", "Ariel B. Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta     ",
				"Cássia de Arruda N. Santos", "Emerson da Silva Santana", "Enzo Fulaneto          ",
				"Ester Gomes N. Nascimento", "Fábio Campaner Suzuki", "Felipe Matos de Lima", "Felipe Souza da Silva",
				"Flávio Augusto da Costa", "Giovanna S. P. Penedos", "Gustavo Mesquita Ferreira",
				"Henrique Uriel Lopes", "João Pedro Cruz Gomes", "José Paulo de Matos F. Neto", "Letícia Porto Martins",
				"Lucas Silva Nunes de Aguiar", "Maicon Gomes Cerqueira", "Marcos Vinicius C. Rego",
				"Matheus de Araujo Farina", "Matheus de Brito Milani", "Natália Regina S. Rocha",
				"Pamela Paulino          ", "Renata dos Santos Ferreira", "Rodrigo Roseo L. Costa",
				"Sabrina Alves de Paiva", "Sergio de Jesus Severo", "Stefani Fernanda P. Tosi",
				"Talita Gleice M. G. S. Lima", "Thiago da Silva Machado", "Vinícios Lisboa da Silva",
				"Vinicius C. S. Francisco" };
		int[] notas = new int[alunes.length];
		int novaNota;
		String[] matriculas = new String[alunes.length]; // MAT-0X
		String matriculaEscolhida;
		boolean[] ativo = new boolean[alunes.length];
		char resposta;
		String atividadeAlune;

		for (int x = 0; x < alunes.length; x++) {
			ativo[x] = true;
			if (x >= 9) {
				matriculas[x] = "MAT-" + (x + 1);
			} else {
				matriculas[x] = "MAT-0" + (x + 1);
			}

		}
		System.out.println("MATRICULA   ALUNO\t\t\t NOTA\tSTATUS");
		for (int x = 0; x < alunes.length; x++) {
			if (ativo[x] == true) {
				System.out.println(matriculas[x] + "\t    " + alunes[x] + "\t   " + notas[x] + "\tAtivo");
			}
		}
		System.out.println();

		do {
			System.out.print("DIGITE A MATRICULA DO ALUNE: ");
			matriculaEscolhida = ler.next().toUpperCase();

			for (int x = 0; x < alunes.length; x++) {
				if (matriculaEscolhida.equals(matriculas[x])) {
					System.out.println("MATRICULA   ALUNO\t\t\t NOTA\tSTATUS");
					System.out.println(matriculas[x] + "\t    " + alunes[x] + "\t   " + notas[x] + "\tAtivo");
					System.out.print("\nDIGITE A NOTA DO ALUNE: ");
					novaNota = ler.nextInt();
					notas[x] = novaNota;

					System.out.println("QUAL O STATUS DO ALUNE [ATIVO/ INATIVO]: ");
					atividadeAlune = ler.next().toUpperCase();

					if (atividadeAlune.equals("ATIVO")) {
						ativo[x] = true;

					} else if (atividadeAlune.equals("INATIVO")) {
						ativo[x] = false;

					} else {
						System.out.println("STATUS INVÁLIDO, SITUAÇÃO PERMANECE A MESMA!");
					}

				}
			}
			System.out.print("Continuar? [S/N]: ");
			resposta = ler.next().toUpperCase().charAt(0);

		} while (resposta == 'S');

		for (int x = 0; x < alunes.length; x++) {
			if (notas[x] <= 5) {
				System.out.println("Estude mais");
			} else if (notas[x] > 5) {
				System.out.println("Ótimo, continue assim!");
			}
		}

	}

}