import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String frase = null, novaFrase = null;
		
		novaFrase = ler.nextLine();
		
		try{
			
			novaFrase = frase.toUpperCase();
		
		}catch(NullPointerException erro){
			
			System.out.println("Frase inicial é nula");
			
		}
	}

}
