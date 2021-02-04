package exemplo;

public class Comissao2 {

	public static void main(String[] args) {
		
		Comissao bg = new Comissao("Bill Gates", 3000, 15);
		Comissao em = new Comissao("Elon Musk", 1500, 25);
		Comissao jb = new Comissao("Jeff Bezos", 2500, 12.5);

		novaVenda(bg, 2000);
		novaVenda(em, 900);
		novaVenda(jb, 555);

		mostrarFolhaPagamento(bg);
		mostrarFolhaPagamento(em);
		mostrarFolhaPagamento(jb);

	}

	private static void novaVenda(Comissao vend, double valor) {
		vend.incluirVenda(valor);
	}
	
	private static void mostrarFolhaPagamento(Comissao vend) {
		System.out.println();
		System.out.println("Funcionário            Fixo     Comissão        Total");
		System.out.println("----------------   --------     --------    ---------");
		System.out.printf("%-16s %,10.2f   %,10.2f %,12.2f  %n", //
				vend.getNome(), vend.getSalarioFixo(), vend.getComissao(), vend.getSalarioTotal());
	}

}

