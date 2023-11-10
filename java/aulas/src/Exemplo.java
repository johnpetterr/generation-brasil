import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		
		String nome;
		int anoNascimento, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite o ano em que você nasceu: ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		
		System.out.println("\nOlá, " + nome + ", tudo bem?? é verdade que sua idade é "+ idade +"? kkringe");
		
		
	}

}
