package aulafevereiro;

public class Produto {

	public String tipo;
	public String marca; 
	public String preco;
	public String cor;
	public String peso;
	public String garantia;
	public String quantidade;
	public String validade;
	
	public Produto(String tipo, String marca, String preco, String cor, String peso, String garantia, String quantidade,
			String validade) {
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
		this.peso = peso;
		this.garantia = garantia;
		this.quantidade = quantidade;
		this.validade = validade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
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

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public void vender() {
		System.out.println("O produto foi vendido");
	}
	
	public void estocar() {
		System.out.println("O produto foi estocado");
	}
}
