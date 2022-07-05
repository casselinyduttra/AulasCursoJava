/*
 * 13. Faca um programa que leia um numero e exiba o dia correspondente
 * da semana (1-Domingo, 2 -Segunda,etc) se digitar outro valor
 * deve aparecer valor invalido.
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Introduza um numero: ");
			int num = scan.nextInt();
			
			switch (num) {
			case 1: System.out.println("Domingo");
			break;
			case 2: System.out.println("Segunda-Feira");
			break;
			case 3: System.out.println("Terca-Feira");
			break;
			case 4: System.out.println("Quarta-Feira");
			break;
			case 5: System.out.println("Quinta-Feira");
			break;
			case 6: System.out.println("Sexta-Feira");
			break;
			case 7: System.out.println("Sabado");
			break;
			default: System.out.println("Valor Invalido");
			}
			
		
	}

}
