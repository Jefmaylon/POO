package herança;

public class Animal {

	public int tamanho;
	public String cor;
	
	public Animal(int tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void comer() {
		System.out.println("O animal comeu");
	}
}
