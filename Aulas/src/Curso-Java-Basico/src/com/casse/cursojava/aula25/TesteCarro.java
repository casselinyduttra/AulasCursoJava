package com.casse.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro(); //Classe Carro instanciada que virou um Objeto
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia(); //metodo adicionado na classe Carro, aqui vamos chamar esse metodo e exibir na tela.
		
	}

}
