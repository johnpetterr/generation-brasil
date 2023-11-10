package Lista1;

import java.util.Scanner;

public class Equacao2 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("DIGITE OS VALORES:");
		System.out.print("Valo A: ");
		a = ler.nextDouble();
		System.out.print("Valo B: ");
		b = ler.nextDouble();
		System.out.print("Valo C: ");
		c = ler.nextDouble();
		System.out.print("Valo D: ");
		d = ler.nextDouble();
		System.out.print("Valo E: ");
		e = ler.nextDouble();
		System.out.print("Valo F: ");
		f = ler.nextDouble();
		
		x = c * e - b * f / a * e - b * d;
		y = a * f - c * d / a * e - b * d;
		
		System.out.println("Os valores de X é de: '" + x + "' e o valor de Y é de '"+ y +"'.");
		
	}
	
}