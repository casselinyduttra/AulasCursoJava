package com.casse.cursojava.aula26;

public class TesteCarroComRetorno {

	public static void main(String[] args) {
		
		Carro van = new Carro(); // instacia do Carro
		
		
		//atribuicao de valores para seus atributos:
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.obterAutonomia();
		double autonomia = van.obterAutonomia(); //chamando o metodo obterAutonomia
		
		System.out.println("A autonomia do carro é: " +autonomia);
		System.out.println("A autonomia do carro é: " +van.obterAutonomia());
		
		

		
		
	}
}
