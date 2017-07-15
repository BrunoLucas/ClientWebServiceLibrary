package br.com.lucas.livrariawsclient;

import java.rmi.RemoteException;

import br.com.caelum.livraria.webservice.LivrariaWebService;
import br.com.caelum.livraria.webservice.LivrariaWebServiceProxy;
import br.com.caelum.livraria.webservice.Livro;

public class TesteRequestSoapComJava {

	public static void main(String[] args) {
		
		LivrariaWebService livrariaWebService = new LivrariaWebServiceProxy();
		try {
			Livro livros[] = livrariaWebService.obterLivrosPeloTitulo("a");
			for(Livro livro : livros){
				System.out.println("Titulo: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor().getNome());
			}
		} catch (RemoteException e) {
			 System.out.println("Erro: " + e.getMessage());
		}
	}
}
