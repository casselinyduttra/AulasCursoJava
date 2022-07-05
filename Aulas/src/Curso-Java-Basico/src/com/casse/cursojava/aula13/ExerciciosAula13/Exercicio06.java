/*
         ***** OK ACERTEI + ou -, faltou a classe MATh *****
         *substituir o que eu fiz pela classe.
 * 06. Faca um programa que peca o raio de um circulo, e calcule e mostre sua area.
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Introduza o raio do circulo: ");
		double raio = scan.nextDouble();
		
		 double area =  3.14 *(raio*raio); 
		//double area = Math.PI * Math.pow(raio, 2);
		System.out.println(" A area do circulo é: " +area + " mm²");

	}

}
