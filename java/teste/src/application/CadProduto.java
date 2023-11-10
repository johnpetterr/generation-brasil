package application;

import java.util.ArrayList;
import java.util.List;

public class CadProduto {

	public static void main(String[] args) {
		
		int i=1;
		List<String> cadastro = new ArrayList<>();
		
		cadastro.add("santos");
		cadastro.add("parmeira");
		cadastro.add("curintia");
		cadastro.add("psg");
		cadastro.add("spfc");
		
		System.out.println("TAMANHO: "+ cadastro.size());
		
		cadastro.add(4, "juventus");

		for(String time:cadastro) {
			System.out.println(i + " - " + time);
			i++;
		}
		System.out.println("TAMANHO: "+ cadastro.size());
		
		System.out.println(cadastro.get(4));
		
	}

}
