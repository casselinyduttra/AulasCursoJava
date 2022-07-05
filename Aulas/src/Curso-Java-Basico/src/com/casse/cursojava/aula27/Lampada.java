/*
 * 01. Escreva uma classe para representar uma lampada. Desenvolva metodos
 * para ligar, desligar a lampada.
 */
package com.casse.cursojava.aula27;

public class Lampada {

	String modelo; 
	String tipo;
	int potencia;
	String corLuz;
	String tecnologia;
	int garantiaAno;
	boolean ligada;
	
	//metodo para ligar
	void ligar() {
		ligada = true;
	}
	
	//metodo para desligar
	void desligar () {
		ligada = false;
	}
	
	//metodo para mostrar o estado da lampada:
	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lampada esta ligada" );
		}	else {
			System.out.println("Lampada esta desligada");
		}
	}
	
	//metodo para mostrar o estado da lampada, mesmo metodo do acima, mas com estado mais elegante e reducao de codigo:
	//chamada de metodo dentro de um metodo:
	void mudarEstado() {
		if (ligada) {
			desligar();
		}else {
			ligar();
		}
	}

}
