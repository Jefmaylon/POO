package Av1;

import java.util.Scanner;

public class CoronaMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int contador = 1;
		int opcao = 1;
		
		
		while (opcao == 1) {
			
			boolean isAposentado = false;
			int numFunc = 0;
			int mesDesempregado = 0;
			
			System.out.println("Nome Completo: ");
			String nomeCompleto = keyboard.nextLine();
			
			
			System.out.println("Data nascimento (DD-MM-AAAA): ");
			String dataNascimento = keyboard.nextLine();
			
			System.out.println("Categoria (EMPREGADO, EMPREGADOR, DESEMPREGADO): ");
			String categoria = keyboard.nextLine();
			
			categoria = categoria.toUpperCase();
			
			CoronaCategoria categoriaFormatada = CoronaCategoria.valueOf(categoria);
						
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				//EMPREGADO
				System.out.println("� aposentado? (SIM ou N�O)");
				String tecladoAposentado = keyboard.nextLine();
				
				tecladoAposentado = tecladoAposentado.toLowerCase();
				
				switch (tecladoAposentado) {
				case ("sim"):
					isAposentado = true;
					break;
				}
				
			} else if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				//EMPREGADOR
				System.out.println("N�mero de funcion�rios: ");
				numFunc = keyboard.nextInt();
	
			} else {
				//DESEMPREGADO
				System.out.println("Meses desempregado: ");
				mesDesempregado = keyboard.nextInt();
			}
						
			System.out.println("UF: ");
			String estado = keyboard.nextLine();
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				CoronaEmpregado pessoa = new CoronaEmpregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, isAposentado);
			}
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				CoronaEmpregador pessoa = new CoronaEmpregador(nomeCompleto, dataNascimento, estado, categoriaFormatada, numFunc);
			}
			
			if (categoriaFormatada == CoronaCategoria.DESEMPREGADO) {
				CoronaDesempregado pessoa = new CoronaDesempregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, mesDesempregado);
			}
			
			System.out.println("Deseja criar outro benefici�rio? 1 - SIM / 2 - N�O");
			opcao = keyboard.nextInt();

			keyboard.nextLine();
		}

		/*
		System.out.println("Total de usu�rios lidos: " );
		System.out.println("Total de benefici�rios: ");
		System.out.println("Total de valor concedido: ");
		System.out.println("2 maiores benefici�rios: ");
		System.out.println("2 benefici�rios por mais tempo: ");
		*/

		
		/*
		CoronaPessoa pessoa1 = new CoronaPessoa("Jo�o da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADO);
		CoronaPessoa pessoa2 = new CoronaPessoa("Jo�o da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADOR);
		CoronaPessoa pessoa3 = new CoronaPessoa("Jo�o da Silva", "01-01-1990", "SC", CoronaCategoria.DESEMPREGADO);
		
		pessoa1.defineTipoCategoria();
		pessoa2.defineTipoCategoria();
		pessoa3.defineTipoCategoria();
		
		System.out.println(pessoa1.getCategoriaAposentado());
		System.out.println(pessoa2.getNumFunc());
		System.out.println(pessoa3.getMesDesempregado());
		*/
	}
}
