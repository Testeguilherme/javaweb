package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//O método getParameter sempre devolve uma String
		String paramId = request.getParameter("id");
		//o método valueOf da classe Integer tem a função de transformar a String em Integer
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaId(id);
		
		System.out.println(empresa.getNome());
		
		response.sendRedirect("mostraEmpresa.jsp");
		
	}

}
