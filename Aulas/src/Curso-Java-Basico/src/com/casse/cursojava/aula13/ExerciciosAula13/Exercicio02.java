/*
 * ****** OK ACERTEI ******
02. Faca um Programa que peca um numero e entao mostre a mensagem O numero informado foi[numero].
*/
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		
		System.out.println("Introduza um Numero: ");
		int numero = num.nextInt();		
		System.out.println("O numero Informado foi " + numero);
	}

}
