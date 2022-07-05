/*
    ***** OK ACERTEI *****
 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritimo que calcule
 * o seu peso ideal, usando a seguinte formula: (72.7 * altura) -58
 * 
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Qual a sua altura?: ");
			double altura = scan.nextDouble();
		
			double pesoIdeal = (72.7 * altura) - 58;
			
		System.out.println(" Sua altura é: "+ altura);
			System.out.println(" Seu peso Ideal é de: "+ pesoIdeal +" Kg");
		
		
		
	}

}
