/*
 * 1. Faça um Programa que peça dois números e imprima o maior deles.
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o primeiro numero: ");
		 	int numero1 = scan.nextInt();
		System.out.println(" Digite o segundo numero: ");
		 	int numero2 = scan.nextInt();

		 	if ( numero1 > numero2) {
		 		System.out.println("o numero " + numero1 + "é o maior");
		 	}else {
		 		System.out.println("o numero " + numero2 + " é o maior");
		 	}
	}

}
