package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	//Atributo para listar as empresas criadas a partir da classe Empresa
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	//empresas pré criadas para teste
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(Banco.chaveSequencial++);
		empresa1.setNome("Apple");
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Alura");
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	//Método que retorna a lista de empresas criadas
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
	
	//Método para adicionar empresas criadas na lista do Banco
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);		
	}
	
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	
	

	

}
