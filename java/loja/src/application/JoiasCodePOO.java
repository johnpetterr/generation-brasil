package application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Produto;

public class JoiasCodePOO {

	public static void main(String[] args) {

		// FUNÇÕES
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		// LISTAS E OBJETO
		Produto notaFiscal = new Produto();
		ArrayList<Produto> itens = new ArrayList<>();
		ArrayList<Produto> carrinho = new ArrayList<>(); 

		itens.add(new Produto("G7-01", "PULSEIRA ICY", 70.99, 10));
		itens.add(new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 10));
		itens.add(new Produto("G7-03", "COlAR SAFIRA", 39.99, 10));
		itens.add(new Produto("G7-04", "PULSEIRA LIZ", 59.99, 10));
		itens.add(new Produto("G7-05", "ANEL CRISTAL", 65.59, 10));
		itens.add(new Produto("G7-06", "BRINCO JASPE", 85.99, 10));
		itens.add(new Produto("G7-07", "PINGENTE LUA", 45.59, 10));
		itens.add(new Produto("G7-08", "COLAR AMÉLIA", 40.59, 10));
		itens.add(new Produto("G7-09", "ANEL CRISTAL", 99.59, 10));
		itens.add(new Produto("G7-10", "BRINCO ÁGATA", 59.79, 10));

		// VARIAVEIS
		String auxCod, op = " ";
		char op2, op3;
		double contador = 0.0;
		int pos, auxQntd, retirarProd, pagamento, auxQntd2[] = new int[itens.size()];

		// TABELA RELAÇÃO PRODUTOS + NOME/SLOGAN
		linha();
		System.out.print("\n\t\t    \n");
		nome();
		for (Produto lista : itens) {
			System.out.print("\n" + lista.getCodigo() + "\t" + lista.getNome() + "\t  " + df.format(lista.getValor())
					+ "\t       " + lista.getEstoque());
		}

		// VALIDAÇÃO DE COMPRA
		linha();
		System.out.print("DESEJA FAZER COMPRAS? [S/N]: ");
		op = leia.next().toUpperCase();
		linha();

		if (op.equals("S") || op.equals("SIM")) {

			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS
			do {
				leia.nextLine();
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.nextLine().toUpperCase();						

				// LAÇO DA VALIDAÇÃO DO CÓDIGO DO PRODUTO
				for (int x = 0; x < itens.size(); x++) {
					pos = x;
					
					// LAÇO CONDICIONAL DE VALIDAÇÃO DO CÓDIGO INSERIDO
					if (itens.get(pos).getCodigo().equals(auxCod)) {
						System.out.print("\nCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
						System.out.print("\n" + itens.get(pos).getCodigo() + "\t" + itens.get(pos).getNome() + "\t"
								+ itens.get(pos).getValor() + "\t  " + itens.get(pos).getEstoque() + "\n");
						System.out.print("\nINFORME A QUANTIDADE QUE DESEJA: ");
						auxQntd = leia.nextInt();

						// LAÇO CONDICIONAL DE VALIDAÇÃO DA QUANTIDADE NO ESTOQUE
						if (auxQntd > itens.get(pos).getEstoque()) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.println("O ESTOQUE É DE: " + itens.get(pos).getEstoque());

						} else if (auxQntd < 0) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque());

						} else if (auxQntd == 0) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque());

						} else {
							carrinho.add(new Produto(itens.get(pos).getCodigo(), itens.get(pos).getNome(),
									itens.get(pos).getValor(), auxQntd));
							itens.get(pos).retirarEstoque(auxQntd);
							leia.nextLine();
							auxQntd2[pos] = auxQntd;

							// EXIBIÇÃO DE CARRINHO
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							System.out.println("\tCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
							for (Produto lista2 : carrinho) {
								System.out.print("\n\t" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t"
										+ lista2.getValor() + "\t   " + lista2.getEstoque());
							}
						}
					}
				}

				// RELAÇÃO DE PRODUTOS NOVAMENTE ANTES DE FINALIZAR A COMPRA
				linha();
				System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
				linha();
				System.out.print("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
				for (Produto lista : itens) {
					System.out.print("\n" + lista.getCodigo() + "\t" + lista.getNome() + "\t  "
							+ df.format(lista.getValor()) + "\t       " + lista.getEstoque());
				}
				linha();

				// CONDICIONAL QUE SAI DO LAÇO DO..WHILE
				System.out.print("DESEJA CONTINUAR COMPRANDO? [S/N]: ");
				op2 = leia.next().toUpperCase().charAt(0);
				linha();

			} while (op2 == 'S');

			// EXIBIÇÃO DO CARRINHO FINAL
			if (contador != 0) {
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				for (Produto lista2 : carrinho) {
					System.out.print("\n" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t  "
							+ df.format(lista2.getValor()) + " \t" + lista2.getEstoque());
				}
			}
			
			// MODIFICAÇÃO DO PEDIDO
			System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
			System.out.println("\tCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
			for (Produto lista2 : carrinho) {
				System.out.print("\n\t" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t"
						+ lista2.getValor() + "\t   " + lista2.getEstoque());
			}
			linha();
			System.out.print("\nDESEJA MODIFICAR O PEDIDO? [S/N]: ");
			op3 = leia.next().toUpperCase().charAt(0);
			
			while(op3 == 'S') {
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.next().toUpperCase();

				for (int x = 0; x < itens.size(); x++) {
					pos = x;
					
					if (carrinho.get(pos).getCodigo().equals(auxCod)) {
						System.out.print("INFORME A QUANTIDADE QUE DESEJA RETIRAR DO PRODUTO: ");
						retirarProd = leia.nextInt();
						carrinho.get(pos).retirarEstoque(retirarProd);
					}
				}

				linha();
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				System.out.println("\tCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
				for (Produto lista2 : carrinho) {
					System.out.print("\n\t" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t"
							+ lista2.getValor() + "\t   " + lista2.getEstoque());
				}
				linha();
				System.out.print("\nDESEJA CONTINUAR MODIFICANDO? [S/N]: ");
				op3 = leia.next().toUpperCase().charAt(0);

			}

			// FINALIZAÇÃO DAS COMPRAS
			linha();
			for (int x = 0; x < carrinho.size(); x++) {
				pos = x;
				contador += (carrinho.get(pos).getValor() * carrinho.get(pos).getEstoque());
			}
			System.out.print("\t   VALOR TOTAL DA COMPRA: R$" + df.format(contador));
			linha();
			System.out.print("\t\tFORMA DE PAGAMENTOS:\n\n");
			System.out.print(" OPÇÃO 1 - A VISTA COM 10% DESCONTO\n");
			System.out.print(" OPÇÃO 2 - NO CARTÃO COM ACRESCIMO DE 10%\n");
			System.out.print(" OPÇÃO 3 - EM 2X COM 15% TOTAL DE ACRESCIMENTO\n");
			linha();

			// FUNÇÃO FORMA DE PAGAMENTO
			do {
				System.out.print("INSIRA AQUI SUA FORMA DE PAGAMENTO: ");
				pagamento = leia.nextInt();

					switch (pagamento) {

					case 1:
						notaFiscal.pagamentos(pagamento, contador);
						carrinho.clear();
						break;

					case 2:
						notaFiscal.pagamentos(pagamento, contador);
						carrinho.clear();
						break;

					case 3:
						notaFiscal.pagamentos(pagamento, contador);
						carrinho.clear();
						break;

					default:
						System.out.printf("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.\n");
						break;

					}

			} while (pagamento > 3 || pagamento <= 0);

			// RELAÇÃO DE PRODUTOS COM OS ESTOQUES RENOVADOS
			linha();
			System.out.print("\n\t\t    \n");
			nome();
			for (int i = 0; i < itens.size(); i++) {
				pos = i;
				itens.get(pos).adicionarEstoque(auxQntd2[pos]);
				System.out.print("\n" + itens.get(pos).getCodigo() + "\t" + itens.get(pos).getNome() + "\t  "
						+ df.format(itens.get(pos).getValor()) + "\t       " + itens.get(pos).getEstoque());
			}
			System.out.println();

			// CARRINHO DE COMPRAS FINAL E VAZIO
			linha();
			System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
			System.out.println("\tCÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
			System.out.println("\t\tCARRINHO VAZIO!");
			linha();

		} else if (op.equals("N") || op.equals("NÃO") || op.equals("NAO")) {
			nota();
			System.out.println("\t\t     ATÉ BREVE!!!");
			linha();
		} /*
			 * else { System.out.print("OPÇÃO INCORRETA."); main(args); }
			 */
	}

	// FUNÇÕES EXTRAS
	public static void nome() {
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n");
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n");
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.println("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
	}

	public static void nota() {
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n");
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n");
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
		linha();
	}

	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════");
	}
}