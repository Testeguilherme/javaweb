package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresas {
	
	public String removeEmp (HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		System.out.println("Removendo empresas");
		
		//O método getParameter sempre devolve uma String
		String paramId = request.getParameter("id");
		
		//o método valueOf da classe Integer tem a função de transformar a String em Integer
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		//redireciona a página para um local específico (Obs: não pode ter / 'barra')
		return "redirect:entrada?acao=ListaEmpresas"; 
		
		
		
	}
}
