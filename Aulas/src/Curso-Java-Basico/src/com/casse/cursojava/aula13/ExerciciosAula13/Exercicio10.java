/*
               ***** OK ACERTEI *****
 * 10. Faca um programa que peca a temperatura em graus Celsius,
 * transforme e mostre a temperatura em Fahrenheit
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Introduza a Temperatura em Celsius: ");
		double grauEmCel = scan.nextDouble();		
		
		double grauEmFaren = (grauEmCel *1.8) + 32;
		
		System.out.println(" A temperatura em Fahrenheit é: " +grauEmFaren +" Fº");

	}

}
