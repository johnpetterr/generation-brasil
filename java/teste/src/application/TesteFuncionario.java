package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		char op;
		
		List<Funcionario> folha = new ArrayList<>();
		
		do {
			
			System.out.print("FUNCIONARIO NORMAL OU TERCEIRO [N/T]: ");
			char tipo = ler.next().toUpperCase().charAt(0);
			
			System.out.print("DIGITE A MATRÍCULA: ");
			String matricula = ler.next().toUpperCase();
			
			System.out.print("DIGITE AS HORAS TRABALHADAS: ");
			int horasTrabalhadas = ler.nextInt();
			
			System.out.print("DIGITE O VALOR POR HORA R$: ");
			double valorHora = ler.nextDouble();
			
			if(tipo == 'T') {
				System.out.print("\nDIGITE O VALOR ADICIONAL DO TERCEIRO R$:");
				double adicional = ler.nextDouble();
				
				folha.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
			}else if (tipo == 'N') {
				folha.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			}
			
			System.out.println("\nDESEJA SAIR? [S/N]");
			op = ler.next().toUpperCase().charAt(0);
			
		}while(op == 'N');
		
		System.out.println("\nTABELA");
		System.out.print("MAT.\tHORAS-T.\tVALOR-HR.\tSALARIO");
		for(Funcionario lista:folha) {
			System.out.printf("\n%s\t  %d\t\t %.2f\t\t%.2f",lista.getMatricula(),lista.getHorasTrabalhadas(),lista.getValorPorHora(), lista.salario());
		}
		
//		Terceiro f1 = new Terceiro("001", 80, 30.0, 10.0);
//		Funcionario f2 = new Funcionario("002", 80, 30.0);
//		System.out.println("SALARIO: " + f2.salario());
	}
}
