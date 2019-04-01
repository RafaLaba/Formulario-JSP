package br.com.trabalho.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trabalho.bean.Cadastro;
import br.com.trabalho.bean.CadastroDAO;


	@WebServlet(name="AdicionaCadastroServlet", urlPatterns={"/adicionarCadastro"})
	
	public class AdicionaCadastroServlet extends HttpServlet{

		private static final long serialVersionUID = 1L;
		
		@Override
		protected  void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
			PrintWriter out = resp.getWriter();
			
			//Captura os dados que vieram do form e coloca nas variÃ¡veis
			String nome = req.getParameter("nome");
			String cpf = req.getParameter("cpf");
			String cep = req.getParameter("cep");
			
			
			//Instanciar as classes dos Beans
			Cadastro cadastro = new Cadastro();
			cadastro.setNome(nome);
			cadastro.setCPF(cpf);
			cadastro.setCPF(cep);
			CadastroDAO cadastroDAO = new CadastroDAO();
			CadastroDAO.salvar(cadastro);
			
//			out.println("<%@ page language=\'java\' contentType=\'text/html; charset=UTF-8\' pageEncoding=\'UTF-8\'%>");
//			out.println("<!DOCTYPE html PUBLIC \'-//W3C//DTD HTML 4.01 Transitional//EN\' \'http://www.w3.org/TR/html4/loose.dtd\'>");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Adicionar contatos</title>");
			out.println("</head>");
			out.println("<body align='center'>");
			out.println("<p>Contato adicionado: <b>" + nome + "</b></p>");
			out.println("<p>CPF adicionado: <b>" + cpf + "</b></p>");
			out.println("<p>CEP adicionado: <b>" + cep + "</b></p>");
			out.println("<br>");
			out.println("<a href='index.jsp'><input type='button' value='voltar'></a>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}
