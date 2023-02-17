package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//O método getParameter sempre devolve uma String
		String paramId = request.getParameter("id");
		
		//o método valueOf da classe Integer tem a função de transformar a String em Integer
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		//redireciona a página para um local específico (Obs: não pode ter / 'barra')
		response.sendRedirect("listaEmpresas");
	}
	

}
