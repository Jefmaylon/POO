package igreja;

import java.util.Scanner;

public class IgrejaMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner DDD = new Scanner(System.in);
		Scanner Number = new Scanner(System.in);
		
		System.out.println("Digite um DDD v�lido: ");
		int ddd = DDD.nextInt();
		if(ddd > 0 && ddd <= 99) {
			ddd = DDD.nextInt();
		} else {
			System.out.println("Por favor, digite um DDD v�lido: ");
			ddd = DDD.nextInt();
		}
		// System.out.println("DDD: " + ddd);
		
		
		System.out.println("Digite a quantidade de n�meros a serem gerados: ");
		int number = Number.nextInt();
		// System.out.println("Number: " + number);
		
		
	}

}
