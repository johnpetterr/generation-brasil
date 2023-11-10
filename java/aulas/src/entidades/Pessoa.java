package entidades;

public class Pessoa {

	// ATRIBUTOS
	private String nome;
	private int anoNascimento;
	private String cpf;
	private char pronome; // (m - ele/dele) (f - ela/dela) (e - elu/delu)
	private boolean status; // true = ativa false = inativo

	// CONSTRUTORES
	public Pessoa(String nome, int anoNascimento, String cpf, char pronome, boolean status) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.pronome = pronome;
		this.status = status;
	}

	// ENCAPSULAMENTO - GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// DEPOIS DE ATRIBUTOS TUDO SÃO METODOS()
	// public void mostrarIdade() {
	// System.out.print(2021 - this.anoNascimento);
	// }
	//
	// public int calcIdade(int anoAtual) {
	// int valor;
	// valor = anoAtual - anoNascimento;
	//
	// return valor;
	// }
}
