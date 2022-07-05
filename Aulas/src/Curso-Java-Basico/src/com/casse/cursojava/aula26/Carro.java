package com.casse.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; //capacidade do tanque de combustivel
	double consumoCombustivel; // consumo de combustivel em km
	
	double obterAutonomia() {
		System.out.println("Metodo obter autonomia foi chamado."); // aqui pode ter qualquer logica de programacao,
		//o que vai ser retornado é o valor que esta nesse return:
		return capCombustivel * consumoCombustivel;
	}
}
