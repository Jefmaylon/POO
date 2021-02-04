package aulafevereiro;

public class Pessoa {

	public String pessoa;
	private String nome;
	private int idade;
	private String raca;
	private String genero;
	private int altura;
	private int peso;
	private String profissao;
	private String estudo;
	private String nacionalidade;
	private String moradia;
	
	public Pessoa(String pessoa, String nome, int idade, String raca, String genero, int altura, int peso,
			String profissao, String estudo, String nacionalidade, String moradia) {
		this.pessoa = pessoa;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
		this.profissao = profissao;
		this.estudo = estudo;
		this.nacionalidade = nacionalidade;
		this.moradia = moradia;
	}
	
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEstudo() {
		return estudo;
	}
	public void setEstudo(String estudo) {
		this.estudo = estudo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getMoradia() {
		return moradia;
	}
	public void setMoradia(String moradia) {
		this.moradia = moradia;
	}
	
	public void andar() {
		System.out.println("A pessoa andou");
	}
	public void correr() {
		System.out.println("A pessoa correu");
	}
	public void nadar() {
		System.out.println("A pessoa correu");
	}
	public void comer() {
		System.out.println("A pessoa comeu");
	}
	public void beber() {
		System.out.println("A pessoa bebeu");
	}
	
	

	
	
}

