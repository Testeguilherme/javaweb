package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	//Atributo para listar as empresas criadas a partir da classe Empresa
	private static List<Empresa> lista = new ArrayList<>();
	
	//empresas pré criadas para teste
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Apple");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Alura");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	//Método que retorna a lista de empresas criadas
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
	
	//Método para adicionar empresas criadas na lista do Banco
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);		
	}

	
	
	
	
	
}
