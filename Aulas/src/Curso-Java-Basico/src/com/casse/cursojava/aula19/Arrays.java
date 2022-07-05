package com.casse.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays ou Vetores
		//Estrutura de dados mais simples que existe
		//na maioria das lingagens de programacao
		//lista ordenada de dados
		//curiosidade: toda vez que vamos trabalhar com vetores as posicoes
		//sao indicadas por indices, e sempre comeca pelo 0.
		
		//armazenar a temperatura durante um ano todo:
		
		double[] temperaturas = new double[365];
		temperaturas[0]= 31.3;
		temperaturas[1]= 32;
		temperaturas[2]= 33.7;
		temperaturas[3]= 34;
		temperaturas[4]= 33.1;
		
	
		System.out.println("O valor da temperatura do dia 1: "+temperaturas[0]);
		
		//saber o tamanho do array:
		System.out.println("tamanho do array: " +temperaturas.length);
		
		//estrutura sempre usada em arrays:
		for (int i=0; i< temperaturas.length; i++) {
			System.out.println("o valor da temperatura do dia "+ (i+1) + " é " + temperaturas[i] );
		}
		
		//for melhorado, so utilizado para saber os valores:
			for (double temp : temperaturas) {
				System.out.println(temp);
	}
	}

}
