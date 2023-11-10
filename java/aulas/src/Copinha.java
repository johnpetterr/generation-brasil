import java.util.Scanner;

public class Copinha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS
		String times[] = {"SANTOS     ", "SPFC     ", "PALMEIRAS", "CORINTHIANS"}, timeId[] = new String[4], auxId;
		int i, pontos[] = {0, 0, 0, 0};
		char op = ' ';
		
		//GERADOR DO ID DOS TIMES
		for(i = 0; i < timeId.length; i++) {
			if(i == 9) {
				timeId[i] = "CPF-" + (i + 1);
			}else {
				timeId[i] = "CPF-0" + (i + 1);
			}
		}
		
		//TABELA DOS TIMES
		System.out.println("ID\t TIME\t      PONTOS");
		for(i = 0; i < timeId.length; i++) {
			System.out.printf("%s\t %s\t%d\n", timeId[i], times[i], pontos[i]);
		}
		System.out.println();
		
		for(int x = 0; x < 3; x++) {
			//LA�O QUE RODA AS RODADAS QUE VOC� QUER
			System.out.println("RODADA: "+ (x + 1));
			//LA�O QUE RODA TODOS OS TIMES
			for(i = 0; i < timeId.length; i++) {
				System.out.printf("%s G- GANHOU / P- PERDEU / E- EMPATOU: ", times[i]);
				op = ler.next().toUpperCase().charAt(0);
				if(op == 'G') {
					pontos[i] += 3; 
				}else if(op == 'E') {
					pontos[i] += 1;
				}else if(op == 'P') {
					pontos[i] += 0;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("AP�S AS RODADAS A TABELA FOI ATUALIZADA");
		System.out.println("ID\t TIME\t      PONTOS");
		for(i = 0; i < timeId.length; i++) {
			System.out.printf("%s\t %s\t%d\n", timeId[i], times[i], pontos[i]);
		}
	
		System.out.print("\nDIGITE O ID DE UM TIME: ");
		auxId = ler.next();
		System.out.println("ID\t TIME\t      PONTOS");
		for(i = 0; i < timeId.length; i++) {
			if(auxId.equals(timeId[i])) {
				System.out.printf("%s\t %s\t%d\n", timeId[i], times[i], pontos[i]);
			}
		}
	}

}
