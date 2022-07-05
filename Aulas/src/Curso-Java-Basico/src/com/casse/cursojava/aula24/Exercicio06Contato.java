package com.casse.cursojava.aula24;

public class Exercicio06Contato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.nome = "Lucas";
		contato.endereco = "Rua do Moinho Velho";
		contato.email = "lucas@email.com";
		
		contato.telefones = new String [5];
		contato.telefones[0] = "999.999.999";
		contato.telefones[1] = "555.555.555";
		contato.telefones[2] = "888.888.888";
		
		System.out.println("Nome: " + contato.nome );
		System.out.println("Contato: " + contato.telefones[2] );
		System.out.println("Endereço: " + contato.endereco );
		System.out.println("Email: " + contato.email);
		
				

	}

}
