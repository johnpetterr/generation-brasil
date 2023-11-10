package application;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;

public class TestePet {

	public static void main(String[] args) {
		
//		pet p1 = new pet("FELINA", 2018);
//		
//		p1.setPorte('G');
//		
//		System.out.printf("RAÇA: %s\nIDADE: %d ANOS\nPORTE: %c\n", p1.getRaca(), (2020-p1.getAnoNascimento()), p1.getPorte());
//		p1.emitirSom();
//		System.out.printf("\nA IDADE É: %d ANOS", p1.idade());
		
		Cachorro dog1 = new Cachorro("PITBULL", true);
		Gato cat1 = new Gato("SIAMES", 2015, false);
		Ave bird1 = new Ave("BEM-TE-VI", 2020, true);
		
		dog1.setAnoNascimento(2019);
		dog1.setPorte('G');
		cat1.setPorte('P');
		
		
		System.out.printf("RAÇA: %s\nIDADE: %d ANOS\nPORTE: %c", dog1.getRaca(), dog1.idade(), dog1.getPorte());
		dog1.emitirSom();
		
		System.out.println();
		System.out.printf("RAÇA: %s\nIDADE: %d ANOS\nPORTE: %c", cat1.getRaca(), cat1.idade(), cat1.getPorte());
		cat1.emitirSom();
		
		System.out.println();
		System.out.printf("RAÇA: %s\nIDADE: %d ANOS", bird1.getRaca(), bird1.idade());
		bird1.emitirSom();
	}

}
