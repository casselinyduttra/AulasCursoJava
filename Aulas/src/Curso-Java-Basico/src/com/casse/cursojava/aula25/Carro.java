 package com.casse.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; //capacidade do tanque de combustivel
	double consumoCombustivel; // consumo de combustivel em km
	
	//uma boa pratica de JAVA é que os nome de metodos sempre comeca com verbo.
	//exibirautonomia, vai exibia na tela, que simplesmente vai multiplicar a cap do combustivel com o consumo de combustivel.
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	}
	
}
