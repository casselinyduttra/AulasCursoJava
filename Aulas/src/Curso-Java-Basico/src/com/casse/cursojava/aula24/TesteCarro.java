package com.casse.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		//instanciando uma Classe, atraves da palavra new:
		//Criação de objetos:
		//como setamos valores para os nossos atributos do objeto: nomeDaVariavel.nomeDoAtributo:
		
		//objeto 01
		Carro van = new Carro();
		van.marca = "Fiat"; // String
		van.modelo = "Ducato"; // String
		van.numPassageiros = 10; // int
		van.capCombustivel = 100; // double
		van.consumoCombustivel = 0.2; // double
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//objeto 02
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
