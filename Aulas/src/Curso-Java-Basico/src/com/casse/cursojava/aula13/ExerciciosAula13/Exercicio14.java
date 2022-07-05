/*
                 ***** OK ACERTEI ***** 
* Faca um programa que peca o tamanho de um arquivo para download (em MB) e a velocidade de um link
 * de internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link
 * (em minutos).
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Qual o tamanho do arquivo que queres fazer o download (MB)?: ");
			double tamArquivo = scan.nextDouble();
			
		System.out.println(" Qual a velocidade da Internet para o download (Mbps)?: ");
			double veloInternet = scan.nextDouble();
		
		double tempoAproximado = tamArquivo / veloInternet;
			System.out.println(" O tempo aproximado para o download terminar é de " +tempoAproximado +" minutos");
		
	}

}
