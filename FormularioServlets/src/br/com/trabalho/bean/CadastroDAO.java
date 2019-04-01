package br.com.trabalho.bean;

import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {
	private static List<Cadastro> clientes = new ArrayList<Cadastro>();
	
	//MÃ©todo para salvar um objeto na lista "contatos"
	public void salvar(Cadastro cadastro) {
		clientes.add(cadastro);
	}
	
	//MÃ©todo para retornar a lista de objetos
	public List<Cadastro> getLista(){
		return clientes;
	}
}
