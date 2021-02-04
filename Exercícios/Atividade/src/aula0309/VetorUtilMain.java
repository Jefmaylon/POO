package church;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChurchMain {

	public static void main(String[] args) {
		
		System.out.println("Sistema gerador de número de telefones para igrejas entrarem em contato");
		System.out.println("*************************");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Informe um DDD (Ex: 11): ");
		int ddd = teclado.nextInt();
		System.out.println("Informe a quantidade de números que deseja gerar: ");
		int qtde = teclado.nextInt();
		
		//Intercambiando dados entre classes		
		ChurchOp lista = new ChurchOp(ddd, qtde);
		
		//System.out.println(Arrays.toString(tel1.getListNumbers()));
		
		//System.out.println(lista.));
		//System.out.println(lista.getQTDE());
		//System.out.println(Arrays.toString(lista.getListNumbers()));
		
		//System.out.println();
		
		
		//ChurchOp[] listNumbers = new ChurchOp[qtde];
		
		//Random rd = new Random();
		
		//int n;
		//for (int i = 0; i < qtde; i++) {
		//	n = 6 + rd.nextInt(10);
		//	System.out.println(n);
		//	listNumbers[i] = new ChurchOp(ddd + n, n);
		//}
		
		/*
		ChurchOp number;
		for (int i = 0; i < qtde; i++) {
			number = listNumbers[i];
			System.out.println("Teste " +  Arrays.toString(listNumbers[i]));
		}
		/*
		int[] resumo = new int[3];
		Aposta ap;
		for (int i = 0; i < QT_APOSTAS; i++) {
			ap = apostas[i];
			n = Concurso.acertos(ap, Concurso.resultado());
			if (n >= 4) {
				System.out.println(ap.getNome() + " = " + n + " acertos.");
				resumo[n - 4]++;
			}
		}
		
		*/

							
		
		
		//Teste de validade do DDD e da QTDE
		//System.out.println(tel1.testDDD());
		//System.out.println(tel1.testQTDE());
		
		//System.out.println(tel1.getDDD());
		//System.out.println(tel1.getQTDE());
		
		System.exit(0);
	}

}