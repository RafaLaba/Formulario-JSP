package br.com.trabalho.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trabalho.bean.Cadastro;
import br.com.trabalho.bean.CadastroDAO;

public class ListaCadastroServlet {

	//@Override
	protected  void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		PrintWriter out = resp.getWriter();
		CadastroDAO cadastroDAO = new CadastroDAO();
		List<Cadastro> lista = cadastroDAO.getLista();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Listar Clientes</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Listagem de Clientes</h2><ul>");
		for(Cadastro contato : lista) {
			out.println("<li>Nome: " + contato.getNome() + "</li>");
			out.println("<li>E-mail: " + contato.getCPF() + "</li>");
			out.println("---------------------------------------------");
		}
		out.println("</ul><br>");
		out.println("<a href='index.html'>Voltar</a>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}