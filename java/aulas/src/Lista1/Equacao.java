package Lista1;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		c = ler.nextInt();

		r = (a + b);
		s = (b + c);
		d = ((Math.pow(r, 2.0) + Math.pow(s, 2.0))) / 2;
		
		System.out.println("\nO resultado da expressão é de: " + d);
	}
	
}