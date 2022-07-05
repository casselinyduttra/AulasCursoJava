/*
             ***** OK ACERTEI *****
 * 11. Faca um programa que peca 2 numero inteiros e um numero real.
 * calcule e mostre:
 *  1. o produto do dobro do primeiro com metade do segundo. OK
 *  2. a soma do triplo do primeiro com o terceiro
 *  3. o terceiro elevado ao cubo
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Introduza o primeiro numero: ");
			int num1 = scan.nextInt();
		System.out.println(" Introduza o segundo numero: ");
			int num2 = scan.nextInt();
		System.out.println(" Introduza o terceiro numero: ");
			double num3 = scan.nextDouble();
		
		int produto = (num1 * 2) + (num2/2);
		
		double somaTriplo = (num1 * 3) + num3;
		
		double potencia = num3 * num3 * num3;
		// double potencia = Math.pow (num3, 3);
		
		System.out.println(" O produto do dobro do primeiro com metade do segundo: "+ produto);
			System.out.println(" A soma do triplo do primeiro com o terceiro: "+ somaTriplo);
				System.out.println(" O terceiro Numero elevado ao cubo é: "+ potencia );
	}

}
