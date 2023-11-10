package Lista5;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Preguica pet1 = new Preguica("PREGUICA-DE-COLEIRA", "QUADRUPÍDE", "VERTEBRADO", "JEREMIAS", 5);
		Cachorro pet2 = new Cachorro("ROTTWEILLER", "QUADRUPÍDE", "VERTEBRADO", "MAYA", 9);
		Cavalo pet3 = new Cavalo("FRÍSIO", "QUADRUPÍDE", "VERTEBRADO", "JATO", 8);
		
		System.out.printf("ESPÉCIE: %s\nANDAR: %s\nOSSOS: %s\nNOME: %s\nIDADE: %d\n", pet1.getRaca(), pet1.getAndar(), pet1.getOssos(), pet1.getNome(), pet1.getIdade());
		pet1.emitirSom();
		System.out.println();
		System.out.printf("ESPÉCIE: %s\nANDAR: %s\nOSSOS: %s\nNOME: %s\nIDADE: %d\n", pet2.getRaca(), pet2.getAndar(), pet2.getOssos(), pet2.getNome(), pet2.getIdade());
		pet2.emitirSom();
		System.out.println();
		System.out.printf("ESPÉCIE: %s\nANDAR: %s\nOSSOS: %s\nNOME: %s\nIDADE: %d\n", pet3.getRaca(), pet3.getAndar(), pet3.getOssos(), pet3.getNome(), pet3.getIdade());
		pet3.emitirSom();
	}

}
