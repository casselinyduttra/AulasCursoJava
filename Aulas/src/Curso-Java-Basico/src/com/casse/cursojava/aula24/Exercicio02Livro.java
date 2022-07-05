package com.casse.cursojava.aula24;

public class Exercicio02Livro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.idioma = "Ingles";
		livro.nomeLivro = "Every summer after";
		livro.qtdPaginas = 320;
		livro.tipoLeitura = "Digital";
		
			System.out.println("Nome do livro: " +livro.nomeLivro);
			
	}

}
