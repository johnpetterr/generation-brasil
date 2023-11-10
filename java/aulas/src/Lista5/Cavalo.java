package Lista5;

public class Cavalo extends Animal {

	private String nome;
	private int idade;

	public Cavalo(String raca, String andar, String ossos, String nome, int idade) {
		super(raca, andar, ossos);
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitindo o som do animal...");
	}
}
