package com.casse.cursojava.aula11;

public class SequencialEscape {

	public static void main(String[] args) {
		
		// "Hello,World!"
		System.out.println(" \"Hello, World\"\n\r");
		// o \n\r -> é a mesma coisa de o usar o println,
		//serve para pular linha, e retornar pra cima.
		//1\4 -> imprimir isso na tela, tenho q usar duas \\
		// pois so uma barra \ é inicio de caracter de escape.
		System.out.println("1\\4");
			
				
			

	}

}
