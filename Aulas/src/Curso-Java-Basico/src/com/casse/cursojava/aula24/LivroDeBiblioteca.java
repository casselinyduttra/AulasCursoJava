/*
 * 04. Usando o resultado do modelo Livro como base, crie uma classe "LivroDeBiblioteca"
 * que represente os dados basicos de um livro de uma biblioteca, que pode ser
 * emprestado a leitores.
 */
package com.casse.cursojava.aula24;

import java.util.Date;

public class LivroDeBiblioteca {

	String nomeLivro;
	//= " Every summer after";
	String tipoLeitura;
	//= "Digital";
	int qtdPaginas;
	//= 320;
	String idioma;
	//= "Ingles";
	int numExemplares;
	//= 10;
	String classificacao;
	//= "romance";
	
	boolean emprestado;	
	String emprestadoA;
	public Date dataEntrega;
	
	
}
