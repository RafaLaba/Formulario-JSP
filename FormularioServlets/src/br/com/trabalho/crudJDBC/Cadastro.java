package br.com.trabalho.crudJDBC;
import java.sql.Date;

public class Cadastro {
	private Integer	id;
	private String  nome;
	private String  CPF;
	private String  CEP;
	
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
}