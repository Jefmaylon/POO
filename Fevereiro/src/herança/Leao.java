package herança;

public class Leao extends Animal{

	public boolean juba;
	
	public Leao(int tamanho, String cor, boolean juba) {
		super(tamanho, cor);
		this.juba = juba;
	}


	public boolean isJuba() {
		return juba;
	}


	public void setJuba(boolean juba) {
		this.juba = juba;
	}


	public void cacar() {
		System.out.println("O leao foi caçado");
	}
}
