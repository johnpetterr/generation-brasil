package Lista4;

public class Cliente {

	public static void main(String[] args) {

		/*
		 * Crie uma classe cliente e apresente os atributos e métodos referentes esta
		 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto
		 * e apresente as informações deste objeto no console.
		 */

		// clienteC cliente = new clienteC("João Pedro", "483.XXX.688.XX",
		// "jpcgomes0@gmail.com", 2003);
		//
		// System.out.println("NOME: "+cliente.getNome() + "\nCPF: " + cliente.getCpf()
		// + "\nEMAIL: " + cliente.getEmail() + "\nIDADE: " + cliente.calcIdade(2021));

		// clienteC cliente = new clienteC(null, null, null, 0);
		//
		// cliente.setNome("João Pedro");
		// cliente.setAnoNascimento(2003);
		// cliente.setEmail("jpcgomes0@gmail.com");
		// cliente.setCpf("483.XXX.688.XX");
		//
		// System.out.println("NOME: " + cliente.getNome() + "\nCPF: " +
		// cliente.getCpf() + "\nEMAIL: " + cliente.getEmail() +" "+ "\nIDADE: " +
		// cliente.calcIdade(2021));

		clienteC cliente = new clienteC();

		cliente.mostrarCliente("João Pedro", "483.XXX.688.XX", "jpcgomes0@gmail.com");
		System.out.println("IDADE: " + cliente.calcIdade(2021));
	}

}
