package br.com.trabalho.crudJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CadastroCrudJDBC {
	public void salvar(Cadastro cadastro) {
		Connection conexao = this.geraConexao();
		PreparedStatement insereSt = null;
		String sql = "insert into cadastros (nome, CPF, CEP) values (?, ?, ?, ?, ?)";
		try {
			insereSt = conexao.prepareStatement(sql);
			insereSt.setString(1, cadastro.getNome());
			insereSt.setString(2, cadastro.getCPF());
			insereSt.setString(3, cadastro.getCEP());
			insereSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao incluir cadastro. Mensagem: "
					+ e.getMessage());
		} finally {
			try {
				insereSt.close();
				conexao.close();
			} catch (Throwable e) {
				System.out
						.println("Erro ao fechar operações de inserção. Mensagem: "
								+ e.getMessage());
			}
		}
	}

	public void atualizar(Cadastro cadastro) {
		Connection conexao = this.geraConexao();
		PreparedStatement atualizaSt = null;

		// Aqui não atualizamos o campo data de cadastro
		String sql = "update cadastros set nome=?, CPF=?, CEP=?";

		try {
			atualizaSt = conexao.prepareStatement(sql);
			atualizaSt.setString(1, cadastro.getNome());
			atualizaSt.setString(2, cadastro.getCPF());
			atualizaSt.setString(3, cadastro.getCEP());
			atualizaSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar cadastro. Mensagem: " + e.getMessage());
		} finally {
			try {
				atualizaSt.close();
				conexao.close();
			} catch (Throwable e) {
				System.out
						.println("Erro ao fechar operações de atualização. Mensagem: "
								+ e.getMessage());
			}
		}
	}

	public void excluir(Cadastro cadastro) {
		Connection conexao = this.geraConexao();
		PreparedStatement excluiSt = null;

		String sql = "delete from cadastro where codigo = ?";

		try {
			excluiSt = conexao.prepareStatement(sql);
			excluiSt.setInt(1, cadastro.getID());
			excluiSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao excluir cadastro. Mensagem: "
					+ e.getMessage());
		} finally {
			try {
				excluiSt.close();
				conexao.close();
			} catch (Throwable e) {
				System.out
						.println("Erro ao fechar operação de exclusão. Mensagem: "
								+ e.getMessage());
			}
		}
	}

	public List<Cadastro> listar() {
		Connection conexao = this.geraConexao();
		List<Cadastro> Cadastros = new ArrayList<Cadastro>();
		Statement consulta = null;
		ResultSet resultado = null;
		Cadastro cliente = null;
		String sql = "select * from cadastros";
		try {
			consulta = conexao.createStatement();
			resultado = consulta.executeQuery(sql);
			while (resultado.next()) {
				cliente = new Cadastro();
				cliente.setID(resultado.getInt("ID"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setCPF(resultado.getString("CPF"));
				cliente.setCEP(resultado.getString("CEP"));
				Cadastros.add(cliente);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do cadastro. Mensagem: "
					+ e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out
						.println("Erro ao fechar operações de consulta. Mensagem: "
								+ e.getMessage());
			}
		}
		return Cadastros;
	}

	public Cadastro buscacadastro(int valor) {
		Connection conexao = this.geraConexao();
		PreparedStatement consulta = null;
		ResultSet resultado = null;
		Cadastro cliente = null;

		String sql = "select * from cadastro where codigo = ?";

		try {
			consulta = conexao.prepareStatement(sql);
			consulta.setInt(1, valor);
			resultado = consulta.executeQuery();

			if (resultado.next()) {
				cliente = new Cadastro();
				cliente.setID(resultado.getInt("ID"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setCPF(resultado.getString("CPF"));
				cliente.setCEP(resultado.getString("CEP"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do cadastro. Mensagem: "
					+ e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out
						.println("Erro ao fechar operações de consulta. Mensagem: "
								+ e.getMessage());
			}
		}
		return cliente;
	}

	public Connection geraConexao() {
		Connection conexao = null;

		try {
			// Registrando a classe JDBC no sistema em tempo de execução
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/DBclientes";
			String usuario = "root";
			String senha = "";
			conexao = DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out
					.println("Classe não encontrada. Erro: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL. Erro: "
					+ e.getMessage());
		}
		return conexao;
	}

//	public static void main(String[] args) {
//		
//		cadastroCrudJDBC cadastroCRUDJDBC = new cadastroCrudJDBC();
//
//		// Criando um primeiro cadastro
//		cadastro beltrano = new cadastro();
//		beltrano.setNome("Beltrano Solar");
//		beltrano.setTelefone("(47) 5555-3333");
//		beltrano.setEmail("beltrano@teste.com.br");
//		beltrano.setDataCadastro(new Date(System.currentTimeMillis()));
//		beltrano.setObservacao("Novo cliente");
//		cadastroCRUDJDBC.salvar(beltrano);
//
//		// Criando um segundo cadastro
//		cadastro fulano = new cadastro();
//		fulano.setNome("Fulano Lunar");
//		fulano.setTelefone("(47) 7777-2222");
//		fulano.setEmail("fulano@teste.com.br");
//		fulano.setDataCadastro(new Date(System.currentTimeMillis()));
//		fulano.setObservacao("Novo cadastro é possível cliente");
//		cadastroCRUDJDBC.salvar(fulano);
//		System.out.println("cadastros cadastrados: " + cadastroCRUDJDBC.listar().size());
//		
//		List<cadastro> lista = cadastroCRUDJDBC.listar();
//		for(cadastro cadastro : lista) {
//			System.out.println(cadastro.getNome());
//		}
//	}
	

}
