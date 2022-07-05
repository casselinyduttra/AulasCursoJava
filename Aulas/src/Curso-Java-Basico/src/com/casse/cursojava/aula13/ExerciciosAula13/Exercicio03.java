/*
                ***** OK ACERTEI *****
   03. Faca um Programa que peca dois numeros e imprima a soma.
*/
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introduza o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Introduza o segundo numero: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println(" A soma dos dois numeros é: " +soma);
	}

}
