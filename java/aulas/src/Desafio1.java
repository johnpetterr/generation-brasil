import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		/*IR
		NOME DO CONTRBUINTE
		FORMA DESEJA SER TRATADO - ELE, ELA, ELLU
		PERGUNTA O SALARIO BRUTO EM REAIS
		ISENTO/ISENTA/ISENTE - SALARIO <=2000
		 */
		
		Scanner ler = new Scanner(System.in);
		
		char pronome;
		double salario, impostoRenda, salarioBruto;
		String nome;
		
		System.out.print("INFORME O SEU NOME: ");
		nome = ler.nextLine().toUpperCase();
		System.out.print("COMO DESEJA SER TRATADO (E/A/U): ");
		pronome = ler.next().toUpperCase().charAt(0);
		System.out.print("INFORME O SEU SALÁRIO: ");
		salario = ler.nextDouble();
		
		
		
		if(salario <= 2000.00) {
			System.out.printf("\nOLÁ %s, SENHOR%c ESTÁ ISENT%c DO SALÁRIO.", nome, pronome, pronome);
		
		}else if(salario > 2000.00 && salario < 5000.00) {
			impostoRenda = salario * 0.15;
			salarioBruto =  salario - impostoRenda;
			
			System.out.printf("OLÁ %s", nome);
			System.out.printf("\nO VALOR DO IMPOSTO É: %.2f", impostoRenda);
			System.out.printf("\nO SALÁRIO BRUTO DA SENHOR%c FICA: R$%.2f", pronome, salarioBruto);
		
		}else if(salario >= 5000.00) {
			impostoRenda = salario * 0.25;
			salarioBruto =  salario - impostoRenda;
			
			System.out.printf("OLÁ %s", nome);
			System.out.printf("\nO VALOR DO IMPOSTO É: %.2f", impostoRenda);
			System.out.printf("\nO SALÁRIO BRUTO DA SENHOR%c FICA: R$%.2f", pronome, salarioBruto);
		}
	}
	
}
