package random;

import java.util.Random;

public class MegaSena {

	private int[] numeros;
	private String nome;
	
	public MegaSena(String nome, int qtde) {
		this.nome = nome;
		this.numeros = new int[qtde];
		Random rd = new Random();
		int num;
		for(int i=0; i<qtde; i++) {
			do {
				num = 1 + rd.nextInt(60);
			} while (jaTem(num));
			this.numeros[i] = num;		
		}	
	}
	
	private boolean jaTem (int n) {
		for (int x : this.numeros) {
			if (x == n) {
				return true;
			}
		}
		return false;
	}
	
	public MegaSena(String nome, int[] numeros) {
		this.nome = nome;
		this.numeros = numeros;
	}
	
	
	public int[] getNumeros() {
		return numeros;
		
	}
	
	public String getNome() {
		return nome;
	}
	
}
