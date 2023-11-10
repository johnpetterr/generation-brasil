package application;

public class Aluno {

	// atributos -> parece variaveis, mas não é
	public String nome;
	public String matriculas;
	public int notas;
	public boolean ativo;
	public int anoNascimento;
	
	
	// sobrecarga  - mais do mesmo
	// construtores
	// encapsulamento e segurança - getter and setters
	// metodos
	public void mostraIdade() {
		System.out.println("O ALUNE "+nome+" TEM A IDADE: " + (2021 - anoNascimento));
	}
	// sobrecarga do metodo
	public void mostraIdade(int anoAtual) {
		System.out.println("O ALUNE "+nome+" TEM A IDADE: " + (anoAtual - anoNascimento));
	}
	public void mostraIdade(int anoAtual, int anoNascimento) {
		System.out.println("O ALUNE "+nome+" TEM A IDADE: " + (anoAtual - anoNascimento));
	}
	// polimorfismo
	// herança
	// abstração
	// delegação
	// override - anottation
}
