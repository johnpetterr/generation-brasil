package Lista4;

public class funcionarioC {

	private String cargo;
	private double salario;
	private String contratacao;
	private int cargaHoraria;
	
	public void mostrarDados(String cargo, double salario, String contratacao, int cargaHoraria) {
		
		this.cargo = cargo;
		this.salario = salario;
		this.contratacao = contratacao;
		this.cargaHoraria = cargaHoraria;
		
		System.out.println("INFORMAÇÕES DO FUNCIONÁRIO");
		System.out.printf("\nCARGO: %s", cargo);
		System.out.printf("\nSALÁRIO: %.2f", salario);
		System.out.printf("\nCONTRATAÇÃO: %s", contratacao);
		System.out.printf("\nCARGA HORÁRIA: %dhrs", cargaHoraria);
	}
}
