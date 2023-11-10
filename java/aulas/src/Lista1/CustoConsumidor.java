package Lista1;

import java.util.Scanner;

public class CustoConsumidor {
	
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.*/
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabricante, custoDesconto, custoImposto;
		int total;
		
		System.out.print("Qual é o custo de fábrica do carro?: ");
		custoFabricante = ler.nextDouble();
		
		custoDesconto = custoFabricante * 0.28;
		custoImposto = custoFabricante * 0.45;
		total = (int) (custoDesconto + custoFabricante + custoImposto);
		
		System.out.println("O seu custo como consumidor é de: R$"+ total +".");
		
	}

}