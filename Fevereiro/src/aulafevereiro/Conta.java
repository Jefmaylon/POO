package aulafevereiro;

public class Conta {

	public String saldo;
	public String extrato;
	public String titular;
	public String limite;
	public String tipo;
	public String valorFatura;
	public String vencimentoFatura;
	public String aberturaConta;
	public String historico;
	public String cpf;
	public Conta(String saldo, String extrato, String titular, String limite, String tipo, String valorFatura,
			String vencimentoFatura, String aberturaConta, String historico, String cpf) {
		this.saldo = saldo;
		this.extrato = extrato;
		this.titular = titular;
		this.limite = limite;
		this.tipo = tipo;
		this.valorFatura = valorFatura;
		this.vencimentoFatura = vencimentoFatura;
		this.aberturaConta = aberturaConta;
		this.historico = historico;
		this.cpf = cpf;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getExtrato() {
		return extrato;
	}
	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getLimite() {
		return limite;
	}
	public void setLimite(String limite) {
		this.limite = limite;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(String valorFatura) {
		this.valorFatura = valorFatura;
	}
	public String getVencimentoFatura() {
		return vencimentoFatura;
	}
	public void setVencimentoFatura(String vencimentoFatura) {
		this.vencimentoFatura = vencimentoFatura;
	}
	public String getAberturaConta() {
		return aberturaConta;
	}
	public void setAberturaConta(String aberturaConta) {
		this.aberturaConta = aberturaConta;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void sacar() {
		System.out.println("Saque efetuado!");
	}
	
	public void depositar() {
		System.out.println("Depósito efetuado!");
	}
	
	public void tranferir() {
		System.out.println("Transferência concluída!");
	}
	
}
