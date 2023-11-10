package Lista5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {

		String item;
		int rm;
		int i, pos;
		char op;

		Scanner ler = new Scanner(System.in);
		List<String> estoque = new ArrayList<>();

		estoque.add("Doces");
		estoque.add("Esmaltes");
		estoque.add("Creme de pentear");
		estoque.add("Pentes garfos");
		estoque.add("Mascaras faciais");

		System.out.print("Quer entrar na loja? [S/N]: ");
		op = ler.next().toUpperCase().charAt(0);
		
		if(op == 'S') {
			
			System.out.println("ESTOQUE");
			for (i = 0; i < estoque.size(); i++) {
				pos = i;
				System.out.println((pos + 1) + ": " + estoque.get(pos));
			}

			System.out.print("\nQual item você quer adicionar?: ");
			item = ler.next();
			estoque.add(item);

			System.out.println("\nESTOQUE");
			for (i = 0; i < estoque.size(); i++) {
				pos = i;
				System.out.println((pos + 1) + ": " + estoque.get(pos));
			}
			
			System.out.print("\nQual a posição do item que você deseja remover?: ");
			rm = ler.nextInt();
			estoque.remove(estoque.get(rm - 1));
			
			System.out.println("\nESTOQUE");
			for (i = 0; i < estoque.size(); i++) {
				pos = i;
				System.out.println((pos + 1) + ": " + estoque.get(pos));
			}
		}

	}

}
