package br.com.trabalho.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trabalho.bean.Cadastro;
import br.com.trabalho.bean.CadastroDAO;

@WebServlet("/listaCadastro")
public class ListaCadastroServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
		
	@Override
	protected  void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		PrintWriter out = resp.getWriter();
		CadastroDAO cadastroDAO = new CadastroDAO();
		List<Cadastro> lista = cadastroDAO.getLista();
//		out.println("<%@ page language=\'java\' contentType=\'text/html; charset=UTF-8\' pageEncoding=\'UTF-8\'%>");
//		out.println("<!DOCTYPE html PUBLIC \'-//W3C//DTD HTML 4.01 Transitional//EN\' \'http://www.w3.org/TR/html4/loose.dtd\'>");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Listar Clientes</title>");
		out.println("</head>");
		out.println("<body align='center'>");
		out.println("<h2>Listagem de Clientes</h2><ul>");
		for(Cadastro contato : lista) {
			out.println("<li>Nome: <b>" + contato.getNome() + "</b></li>");
			out.println("<li>CPF: <b>" + contato.getCPF() + "</b></li>");
			out.println("<li>CPF: <b>" + contato.getCEP() + "</b></li>");
			out.println("---------------------------------------------");
		}
		out.println("</ul><br>");
		out.println("<a href='index.jsp'><input type='button' value='voltar'></a>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}