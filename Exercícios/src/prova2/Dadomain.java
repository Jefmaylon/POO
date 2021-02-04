package prova2;

import java.util.Random;
import java.util.Scanner;

public class Dadomain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de dados a serem lançados: ");
		
		long qtdeLanca;
		
		do { qtdeLanca = entrada.nextLong();
		} while (qtdeLanca <= 1 & qtdeLanca >= 150000);
		
		Random rd = new Random();
		
		long valor1 = 0;
		long valor2 = 0;
		long valor3 = 0;
		long valor4 = 0;
		long valor5 = 0;
		long valor6 = 0;
	
		long num;
		long dadoVer = 1;
		
		do {
			num = 1 + rd.nextInt(6);
		
		
		if (num == 1) {
			valor1++;
		} 
		
		else if (num == 2) {
			valor2++;
		}
		
		else if (num == 3) {
			valor3++;
		}
		
		else if (num == 4) {
			valor4++;
		}	
		
		else if (num == 5) {
			valor5++;
		}	
		
		else if (num == 6) {
			valor6++;
		}
		
		dadoVer++;
		
		}
		while (dadoVer <= qtdeLanca);
		
		System.out.println("Número 1 sorteados: " + valor1);
		System.out.println("Número 2 sorteados: " + valor2);
		System.out.println("Número 3 sorteados: " + valor3);
		System.out.println("Número 4 sorteados: " + valor4);
		System.out.println("Número 5 sorteados: " + valor5);
		System.out.println("Número 6 sorteados: " + valor6);
	}

}
