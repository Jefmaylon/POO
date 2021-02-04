public class Pessoas {
	
	private String nome;
	private String cpf;
	private int idade;
	private int Ano = 2020;
	
	public Pessoas(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getCpf( ) {
		return cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade (int idade) {
		return idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}

	public boolean getIdadeMaiorMenor() {
		if (idade >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String FormtCPF (String cpf) {
		return (cpf.substring(0, 3)) + "." + cpf.substring(3, 6) + "." + cpf.subSequence(6, 9) + "-" + cpf.substring(9, 11);
	}
		
		public void Ano(int ano) {
			if (ano > 0) {
				idade = Ano - ano;
				System.out.println("Idade " + idade + " Anos");
			}
		}	
	
	public void ImprimePessoa() {

        System.out.println("Nome:" + this.nome + "\n" + "CPF:" + this.cpf + "\n");

    }
}