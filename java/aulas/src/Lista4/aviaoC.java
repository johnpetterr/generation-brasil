package Lista4;

public class aviaoC {

	private String nomeAviao;
	private String nomeCapitao;
	private String nomeCoPiloto;
	private int numeroPassageiros;
	private int numeroAeromocas;
	private boolean estado;

	// METODOS
	public void mostrarNomes(String nome, String nomeC, String nomeCoP) {
		this.nomeAviao = nome;
		this.nomeCapitao = nomeC;
		this.nomeCoPiloto = nomeCoP;

		System.out.println("INFORMAÇÕES DO AVIÃO\n");
		System.out.println("NOME AVIÃO: " + nomeAviao);
		System.out.println("NOME CAPITÃO: " + nomeCapitao);
		System.out.println("NOME CO-PILOTO: " + nomeCoPiloto);
	}

	public void mostrarNumeros(int passageiros, int aeromocas, boolean status) {
		this.numeroPassageiros = passageiros;
		this.numeroAeromocas = aeromocas;
		this.estado = status;

		System.out.println("PASSAGEIROS: " + numeroPassageiros);
		System.out.println("AERAMOÇAS: " + numeroAeromocas);

		if (estado == true) {
			System.out.println("ESTADO DO AVIÃO: VOANDO");
		} else {
			System.out.println("ESTADO DO AVIÃO: POUSADO");
		}
	}
}
