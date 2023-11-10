import java.util.Scanner;

public class MaiorSalario {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String nome = "", nomeMSalario = "";
		double salario = 0.00, maiorSalario = 0.00;
		
		System.out.print("Digite o seu nome: ");
		nome = ler.nextLine();
		System.out.print("Digite o seu salário: ");
		salario = ler.nextDouble();
		System.out.println();
		
		while(salario > 0) {
			ler.nextLine();
			System.out.print("Digite o seu nome: ");
			nome = ler.nextLine();
			System.out.print("Digite o seu salário: ");
			salario = ler.nextDouble();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMSalario = nome;
			}
		}
		System.out.println();
		System.out.printf("O %s é quem tem o maior salário, de: R$%.2f", nomeMSalario, maiorSalario);
	}

}
