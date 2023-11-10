package Lista4;

public class produtoEC {

	private String nome;
	private int id;
	private String modelo;
	private String marca;
	private String cor;
	private int ram;
	private double tela;
	
	public void mostrarDados(String nome, int id, String modelo, String marca, String cor, int ram, double tela) {
		this.nome = nome;
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ram = ram;
		this.tela = tela;
		
		System.out.printf("\nNOME: %s", nome);
		System.out.printf("\nID: %d", id);
		System.out.printf("\nMODELO: %s", modelo);
		System.out.printf("\nMARCA: %s", marca);
		System.out.printf("\nCOR: %s", cor);
		System.out.printf("\nARMAZENAMENTO: %d", ram);
		System.out.printf("\nTELA: %.1f", tela);
	}
	
	
	
}
