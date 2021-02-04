package aulafevereiro;

public class Animal {
	
	public String raca;
	public String cor;
	public String peso;
	public String tipo;
	public String genero;
	public String idade;
	
	public Animal(String raca, String cor, String peso, String tipo, String genero, String idade) {
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
		this.tipo = tipo;
		this.genero = genero;
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void comer() {
		System.out.println("O animal comeu");
	}
	
	public void andar() {
		System.out.println("O animal andou");
	}
	
	public void abaixar() {
		System.out.println("O animal abaixou");
	}
	
	public void morder() {
		System.out.println("O animal mordeu");
	}
}
