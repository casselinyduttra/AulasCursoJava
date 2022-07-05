package com.casse.cursojava.aula27;

//Declaração das classe:
public class Carro {
	
	//Declaração dos atributos:
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
    //Declaração dos Métodos
	//metodo sem retorno:
	void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	//metodo com retorno:
	double obterAutonomia() {		
		System.out.println("Método obterAutonomia foi chamado.");		
		return capCombustivel * consumoCombustivel;
	}
	
	//os km nao temos essa informacao entao ela vai ser passada como parametros.
	double calcularCombustivel(double km){	//parametro chamado km	
		double qtdCombustivel = km/consumoCombustivel;		
		return qtdCombustivel;		
	}
	
	//metodo com parametos:
	// quando eu precisar de uma informacao que nao esta disponivel na classe, aqui por exemplo para calcular o combustivel
	// qnto de combustivel é preciso para andar por exemplo 10 km com aquele carro, a qntidade de kms que voce quer calcular 
	//essa informacao a gente nao tem na classe, nao é um atributo da classe, a capacidade de combustivel é um atributo, entao
	//nao precisamos passar como parametros.
	// os parametros sao declarados dentro dos parenteses.
	double calcular(double km) { //parametro chamado KM
		double qtdCombustivel =  km / consumoCombustivel;		
		return qtdCombustivel;
		
	}
	
}
