package conexao.com.br;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		String comando = "CREATE TABLE if not exists CLIENTE ("
				+ "id serial not null,"
				+ "nome varchar(40) not null,"
				+ "email varchar(60) not null);";
		
		try {
			Statement statement = conn.createStatement();
			statement.execute(comando);
			
			String insert1 = "INSERT INTO CLIENTE (nome, email) values ('Carlão','carlao@gmail.com')";
			statement.execute(insert1);
			String insert2 = "INSERT INTO CLIENTE (nome, email) values ('Carlão','carlao@gmail.com')";
			statement.execute(insert2);
			String insert3 = "INSERT INTO CLIENTE (nome, email) values ('Carlão','carlao@gmail.com')";
			statement.execute(insert3);
			String insert4 = "INSERT INTO CLIENTE (nome, email) values ('Carlão','carlao@gmail.com')";
			statement.execute(insert4);
			
			
			String delete1 = "DELETE FROM CLIENTE WHERE ID = 1";
			statement.execute(delete1);
			String delete2 = "DELETE FROM CLIENTE WHERE ID = 2";
			statement.execute(delete2);
			
			String update1 = "UPDATE CLIENTE SET NOME = 'Josnei' WHERE ID = 3";		
			statement.execute(update1);
			String update2 = "UPDATE CLIENTE SET ID = 56 WHERE ID = 4";		
			statement.execute(update2);
			
			String select = "SELECT id, nome, email from CLIENTE";
			ResultSet resultSet = statement.executeQuery(select);
			
			while (resultSet.next()) {
				System.out.println("id: " + resultSet.getInt("id"));
				System.out.println("Nome: " + resultSet.getString("nome"));
				System.out.println("Email: " + resultSet.getString("email"));
			}
			
			System.out.println("Comando executado com sucesso!");
		} catch (SQLException e) {
		System.out.println("deu ruim: " + e.getMessage());
			e.printStackTrace();
		}
		}
}