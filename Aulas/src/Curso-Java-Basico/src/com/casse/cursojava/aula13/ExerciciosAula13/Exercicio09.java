/*
                    ***** OK ACERTEI *****
 * 09. Faca um programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius: C=(5*(F-32)/9).
 */

package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Introduza o Graus em Farenheit: ");
		double grauEmFaren = scan.nextDouble();
				
		double grauEmCel = (5*(grauEmFaren-32)/9);
		
		System.out.println(" A temperatura em Celsius é: " +grauEmCel +" Cº");

	}	
}
