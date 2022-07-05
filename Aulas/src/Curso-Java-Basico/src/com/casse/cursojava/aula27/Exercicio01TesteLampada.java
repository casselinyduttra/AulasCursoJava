package com.casse.cursojava.aula27;

public class Exercicio01TesteLampada {

	public static void main(String[] args) {
	
		Lampada lampada = new Lampada();
		
		lampada.ligar(); //chamando o metodo de ligar.
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
