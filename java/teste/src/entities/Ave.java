package entities;

public class Ave extends Pet {

	private boolean voa;

	// CONSTRUTORES
	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa = voa;
	}

	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}

	//GETTERS AND SETTERS
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}

	@Override
	public void emitirSom() {
		System.out.println("\nTIC-TIUI TIC-TIUI TIC-TIUI");
	}
}
