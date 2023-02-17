package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;


@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//acessar no banco de dados todas as empresas criadas no formulário jsp
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("listaEmpresas", lista);
		//enviar para o jsp a lista de empresas já criadas
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasCriadas.jsp");
		
		rd.forward(request, response);
		
	}

}
