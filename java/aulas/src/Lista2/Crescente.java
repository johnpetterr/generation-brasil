package Lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int i;
		int[] numeros = new int[3];
		
		System.out.println("INFORME TRÊS NÚMEROS: ");
		System.out.printf("N - 1: ");
		numeros[0] = ler.nextInt();
		System.out.printf("N - 2: ");
		numeros[1] = ler.nextInt();
		System.out.printf("N - 3: ");
		numeros[2] = ler.nextInt();
		
		for(i = 0; i < 3; i++) {
			Arrays.sort(numeros);
			System.out.println(numeros[i]);
		}
	}
	
}