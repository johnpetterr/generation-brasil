package application;

import java.util.Scanner;

public class CadNovoAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// instanciando um objeto
		Aluno exemplo1 = new Aluno();
		
		System.out.print("DIGITE O NOME DO ALUNO: ");
		exemplo1.nome = ler.nextLine().toUpperCase();
		System.out.print("DIGITE A MATRICULA DO ALUNO: ");
		exemplo1.matriculas = ler.next().toUpperCase();
		System.out.print("DIGITE O ANO DE NASCIMENTO DO ALUNO: ");
		exemplo1.anoNascimento = ler.nextInt();
		
		System.out.println("MATRICULA: "+ exemplo1.matriculas +" NOME: "+ exemplo1.nome);
		
//		Aluno exemplo2 = new Aluno();
		// heranças dos objetos
//		exemplo1.nome = "EPAMINONDAS";
//		exemplo1.matriculas = "MAT-01";
//		exemplo1.notas = 7;
//		exemplo1.anoNascimento = 1974;
//		exemplo2.anoNascimento= 2003;
//		exemplo2.nome = "MARIA";
//		exemplo2.notas = 10;
//		exemplo2.matriculas = "MAT-01";
//		exemplo1.mostraIdade();
//		exemplo2.mostraIdade(2021);
//		exemplo2.mostraIdade(2053, 2003);
	}

}
