package Lista1;

import java.util.Scanner;

public class Plano {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1, y1, x2, y2, d, p1, p2, resultado;
		
		System.out.println("DIGITE OS VALORES DO PLANO");
		System.out.print("P - X1: ");
		x1 = ler.nextDouble();
		System.out.print("P - Y1: ");
		y1 = ler.nextDouble();
		System.out.print("P - X2: ");
		x2 = ler.nextDouble();
		System.out.print("P - Y2: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		resultado = p1 + p2;
		d = Math.sqrt(resultado);
		
		System.out.println("A distancia entre os pontos são de: " + d);
	}
	
}