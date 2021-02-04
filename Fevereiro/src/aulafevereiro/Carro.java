package aulafevereiro;

public class Carro {

	public String marca;
	public String modelo;
	public String cor;
	public String preco;
	public String tipo;
	public String combustivel;
	public String opcionais;
	public String altura;
	public String motor;
	public String seguranca;
	public Carro(String marca, String modelo, String cor, String preco, String tipo, String combustivel,
			String opcionais, String altura, String motor, String seguranca) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.tipo = tipo;
		this.combustivel = combustivel;
		this.opcionais = opcionais;
		this.altura = altura;
		this.motor = motor;
		this.seguranca = seguranca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getSeguranca() {
		return seguranca;
	}
	public void setSeguranca(String seguranca) {
		this.seguranca = seguranca;
	}
	
	public void andar() {
		System.out.println("O carro andou");
	}
	
	public void re() {
		System.out.println("O carro deu ré");
	}
	
	public void frear() {
		System.out.println("O carro estacionou");
	}
	
	public void virar() {
		System.out.println("O carro virou");
	}
}
