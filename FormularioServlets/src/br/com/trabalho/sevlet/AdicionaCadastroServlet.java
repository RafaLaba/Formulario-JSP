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

public class AdicionaCadastroServlet {
	@WebServlet(name="AdicionaCadastroServlet", urlPatterns={"/adicionarCadastro"})
	public class AdicionaCadastroServlet extends HttpServlet{

		private static final long serialVersionUID = 1L;
		
		@Override
		protected  void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
			PrintWriter out = resp.getWriter();
			
			//Captura os dados que vieram do form e coloca nas variÃ¡veis
			String nome = req.getParameter("nome");
			String cpf = req.getParameter("CPF");
			
			
			//Instanciar as classes dos Beans
			Cadastro cadastro = new Cadastro();
			cadastro.setNome(nome);
			cadastro.setCPF(cpf);			
			CadastroDAO cadastroDAO = new CadastroDAO();
			CadastroDAO.salvar(cadastro);
			
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Adicionar contatos</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>Contato adicionado: " + nome + "</p>");
			out.println("<p>CPF adicionado: " + cpf + "</p>");
			out.println("<br>");
			out.println("<a href='index.jsp'>Voltar</a>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}
}
