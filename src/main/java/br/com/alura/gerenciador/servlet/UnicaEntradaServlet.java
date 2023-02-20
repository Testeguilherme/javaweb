package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresas;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresas;
import br.com.alura.gerenciador.acao.NovaEmpresas;
import br.com.alura.gerenciador.acao.RemoveEmpresas;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListaEmpresas")) {
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.listaEmp(request, response);
			
			
		} else if(paramAcao.equals("RemoveEmpresas")) {
			
			RemoveEmpresas remove = new RemoveEmpresas();
			remove.removeEmp(request, response);
			
			
		} else if(paramAcao.equals("MostraEmpresas")) {
			
			MostraEmpresas mostra = new MostraEmpresas();
			mostra.mostraEmp(request, response);
			
			
		} else if(paramAcao.equals("AlteraEmpresas")) {
			
			AlteraEmpresas mostra = new AlteraEmpresas();
			mostra.alteraEmp(request, response);
			
			
		}  else if(paramAcao.equals("NovaEmpresas")) {
			
			NovaEmpresas mostra = new NovaEmpresas();
			mostra.novaEmp(request, response);
		}  
		
		
		
	}

}
