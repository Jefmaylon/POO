package telefone;

public class AgendaMain {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Agenda");
		
		Contato contato1 = new Contato(1, "Jefferson", "jefmaylon@gmail.com", "New Era", "33333333", "999999999");
		Contato contato2 = new Contato(2, "Carlos", "carlos@gmail.com", "CBC", "33333333", "999999999");
		Contato contato3 = new Contato(3, "João", "joao@gmail.com", "junior's tansp", "33333333", "999999999");
		
		agenda.cadastrar(contato1);
		agenda.cadastrar(contato2);
		agenda.cadastrar(contato3);
		
		agenda.listar();
		
		System.out.println("\nLista após exclusão");
		
		agenda.excluir(contato1);
		
		agenda.listar();
		
		contato2.setEmail("jefzickuhr@gmail.com");
		
		System.out.println("\nLista após set de e-mail no objeto da classe Contato");
		
		agenda.listar();
		
	}
}
