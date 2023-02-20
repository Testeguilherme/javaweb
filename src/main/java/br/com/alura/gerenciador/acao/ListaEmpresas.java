package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {

	
	public void listaEmp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//acessar no banco de dados todas as empresas criadas no formulário jsp
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("listaEmpresas", lista);
		//enviar para o jsp a lista de empresas já criadas
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasCriadas.jsp");
		
		rd.forward(request, response);
		
		System.out.println("Listando empresas");
	}
}
