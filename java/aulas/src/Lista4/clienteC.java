package Lista4;

public class clienteC {

	private String nome;
	private String cpf;
	private String email;
	private int anoNascimento;

	public void mostrarCliente(String nome, String cpf, String email) {
		System.out.println("NOME: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("EMAIL: " + email);
		anoNascimento = 2003;
	}

	// public clienteC(String nome, String cpf, String email, int anoNascimento) {
	// super();
	// this.nome = nome;
	// this.cpf = cpf;
	// this.email = email;
	// this.anoNascimento = anoNascimento;
	// }
	//
	// public String getNome() {
	// return nome;
	// }
	//
	// public void setNome(String nome) {
	// this.nome = nome;
	// }
	//
	// public String getCpf() {
	// return cpf;
	// }
	//
	// public void setCpf(String cpf) {
	// this.cpf = cpf;
	// }
	//
	// public String getEmail() {
	// return email;
	// }
	//
	// public void setEmail(String email) {
	// this.email = email;
	// }
	//
	// public int getAnoNascimento() {
	// return anoNascimento;
	// }
	//
	// public void setAnoNascimento(int anoNascimento) {
	// this.anoNascimento = anoNascimento;
	// }

	public int calcIdade(int anoAtual) {
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}

}
