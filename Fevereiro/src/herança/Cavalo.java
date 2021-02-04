package herança;

public class Cavalo extends Animal{

	public String raca;

	public Cavalo(int tamanho, String cor, String raca) {
		super(tamanho, cor);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public void fugir() {
		System.out.println("O cavalo fugiu");
	}
}
