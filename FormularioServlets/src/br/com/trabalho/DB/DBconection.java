package br.com.trabalho.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconection {
	public static void main(String[] args){
		
		Connection conexao = null;
		try {
			//Registro da classe JDBC e os parametros de conexÃ£o do banco
			String url = "jdbc:mysql://localhost/dbclientes";
			String usuario = "root";
			String senha = "";
			conexao = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conectou!");
			conexao.close();
		} catch(SQLException e) {
			System.out.println("Ocorreu um erro ao criar a conexÃ£o: Erro: " + e.getMessage());
		}
	}
}
