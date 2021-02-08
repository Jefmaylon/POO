package Av1;

import java.util.Scanner;

public class CoronaMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int opcao = 1;
		
		CoronaBeneficiarios beneficio = new CoronaBeneficiarios("Corona Voucher");
			
		while (opcao == 1) {
			
			boolean isAposentado = false;
			int numFunc = 0;
			int mesDesempregado = 0;
			
			System.out.println("Cadastrar novo benefici�rio");
			
			System.out.print("Nome Completo: ");
			String nomeCompleto = keyboard.nextLine();
			
			System.out.print("Data nascimento (DD-MM-AAAA): ");
			String dataNascimento = keyboard.nextLine();
			
			System.out.print("Categoria (EMPREGADO, EMPREGADOR, DESEMPREGADO): ");
			String categoria = keyboard.nextLine();
			
			categoria = categoria.toUpperCase();
			
			CoronaCategoria categoriaFormatada = CoronaCategoria.valueOf(categoria);
						
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				//EMPREGADO
				System.out.print("� aposentado? (SIM ou N�O): ");
				String tecladoAposentado = keyboard.nextLine();
				
				tecladoAposentado = tecladoAposentado.toLowerCase();
				
				switch (tecladoAposentado) {
				case ("sim"):
					isAposentado = true;
					break;
				}
				
			} else if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				//EMPREGADOR
				System.out.print("N�mero de funcion�rios: ");
				numFunc = keyboard.nextInt();
	
			} else {
				//DESEMPREGADO
				System.out.print("Meses desempregado: ");
				mesDesempregado = keyboard.nextInt();
			}
						
			System.out.print("UF: ");
			String estado = keyboard.nextLine();
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				CoronaEmpregado empregado = new CoronaEmpregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, isAposentado, 0.0, 0);
				empregado.setValorBeneficio();
				empregado.setMesBeneficio();
				beneficio.addEmpregado(empregado);
				beneficio.listEmpregados();
				empregado.getBeneficioEmpregado();
				empregado.getBeneficioAposentado();
			}
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				CoronaEmpregador empregador = new CoronaEmpregador(nomeCompleto, dataNascimento, estado, categoriaFormatada, numFunc, 0.0, 0);
				empregador.setValorBeneficio();
				empregador.setMesBeneficio();
				beneficio.addEmpregador(empregador);
				beneficio.listEmpregador();
				empregador.getBeneficioEmpregador();
			}
			
			if (categoriaFormatada == CoronaCategoria.DESEMPREGADO) {
				CoronaDesempregado desempregado = new CoronaDesempregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, mesDesempregado, 0.0, 0);
				desempregado.setValorBeneficio();
				desempregado.setMesBeneficio();
				beneficio.addDesempregado(desempregado);
				beneficio.listDesempregados();
			}
			
			System.out.print("Deseja criar outro benefici�rio? 1 - SIM / 2 - N�O: ");
			opcao = keyboard.nextInt();
			
			keyboard.nextLine();
		
		}
		
		

	}
}
