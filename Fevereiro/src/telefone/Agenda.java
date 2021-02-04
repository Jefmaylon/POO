package telefone;

public class Agenda {
	
	private Contato contatos[]  = new Contato[5];
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void listar() {
		for (int i = 0; i < contatos.length; i++) {
			Contato contato = contatos[i];
			if (contato != null) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("...");
			}
		}
	}
	
	private void excluir() {
	
	}
	
	private void atualizar() {
	
	}
	
	private void novoContato() {
		
	} 
	
}
