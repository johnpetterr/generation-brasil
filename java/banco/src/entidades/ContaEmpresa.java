package entidades;

import java.util.Scanner;

public final class ContaEmpresa extends Conta {
	Scanner leia = new Scanner(System.in);
	private double emprestimoEmpresa = 10000;

	// CONSTRUTOR
	public ContaEmpresa(int numero, String nomeCliente, double emprestimoEmpresa) {
		super(numero, nomeCliente);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	// GETTER AND SETTERS
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	// MÉTODO
	public void pedirEmprestimo() {
		double emprestimo = 0;
		System.out.print("Insira o valor que você deseja para o empréstimo? R$");
		emprestimo = leia.nextDouble();
		if (emprestimo > emprestimoEmpresa) {
			System.out.println("Sua empresa não tem crédito o suficiente para um empréstimo tão grande :( ");
		} else {
			super.credito(getSaldo() + emprestimo);
			emprestimoEmpresa -= emprestimo;
		}
	}
}
