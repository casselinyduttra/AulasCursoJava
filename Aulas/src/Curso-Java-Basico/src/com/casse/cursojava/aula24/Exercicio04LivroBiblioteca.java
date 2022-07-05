package com.casse.cursojava.aula24;

import java.util.Date;

public class Exercicio04LivroBiblioteca {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nomeLivro = "Every summer after";
		
		livro.emprestado = true;
		livro.emprestadoA = " Casseliy";
		livro.dataEntrega = new Date();
		
		System.out.println("Nome do livro: " + livro.nomeLivro);
	}

}
