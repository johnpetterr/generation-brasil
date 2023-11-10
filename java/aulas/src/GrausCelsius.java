import java.util.Locale;
import java.util.Scanner;

public class GrausCelsius {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double C, F, K;
		String nome;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite quantos graus celsius você quer converter: ");
		C = leia.nextDouble();
		
		F = (C * 9/5) + 32;
		K = C + 273.15;
		
		System.out.println("Olá "+ nome +", são "+ F +"° em Farenheit e "+ K + "° em Kelvin.");
		
		leia.close();
	}
	
}
