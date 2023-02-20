package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresas {
	
	
	
	
		public void novaEmp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
			System.out.println("Criando nova empresa");
			
			//receber os dados enviados pelo formulário jsp
			String nomeEmpresa = request.getParameter("nome");
			String dataEmpresa = request.getParameter("data");
			
			//utilizar a string data enviada pelo formulário jsp e estabelecer um formato padrão
			Date dataAbertura = null;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(dataEmpresa);
			} catch (ParseException e) {
				throw new ServletException(e);
			}
			
			//setar os valores recebidos pelo jsp nos métodos da class Empresa
			Empresa empresa = new Empresa();
			empresa.setNome(nomeEmpresa);
			empresa.setDataAbertura(dataAbertura);
			
			//adicionar no banco as empresas cadastradas
			Banco banco = new Banco();
			banco.adiciona(empresa);
			
			//redireciona a página para um local específico
			response.sendRedirect("entrada?acao=ListaEmpresas");
		
		}

}
