import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String agenda[][] = new String[24][31]; // linha- hora coluna-dia
		char op;
		int auxDia, auxHora;

		do {
			System.out.print("Digite o dia do evento  : ");
			auxDia = ler.nextInt();

			System.out.print("Digite a hora do evento : ");
			auxHora = ler.nextInt();
			ler.nextLine();

			System.out.print("Digite o agendamento    : ");
			agenda[auxHora][auxDia] = ler.nextLine();
			System.out.print("Continua S/N :");

			op = ler.next().toUpperCase().charAt(0);

		} while (op == 'S');
		linha();
		System.out.println("\nAGENDA:");
		for (int hora = 0; hora < 24; hora++) {
			for (int dia = 0; dia < 31; dia++) {
				if(agenda[hora][dia] != null) {
					System.out.printf("Dia %d - Hora %d: %s\n", dia, hora, agenda[hora][dia]);
				}
			}
		}

	}
	
	public static void linha() {
		System.out.print("---------------------------------------------------------------------------");
	}

}