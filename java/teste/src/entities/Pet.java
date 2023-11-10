package entities;

public class Pet {

	// atributos, é o que a classe tem, é ou está.
	private String raca;
	private char porte;
	private int anoNascimento;

	// construtores = diferencia de metodos pq ele tem o mesmo nome que a classe
	public Pet(String raca) {
		super();
		this.raca = raca;
	}

	// sobrecarga do primeiro construtor
	public Pet(String especie, int anoNascimento) {
		super();
		this.raca = especie;
		this.anoNascimento = anoNascimento;
	}

	// getters and setters = chamar ou colocar valores nas variaveis
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	// metodos
	public void emitirSom() {
		System.out.println("\nEMITINDO O SOM DO BICHO....");
	}

	public int idade() {
		return 2021 - this.anoNascimento;
	}
}
