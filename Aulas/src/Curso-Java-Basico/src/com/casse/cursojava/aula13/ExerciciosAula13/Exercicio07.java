/*
                ***** OK ACERTEI ***** 
 * 07. Faca um programa que calcule a area de um quadrado, em seguida mostre o dobro desta area 
 * para o usuario.
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Introduza um valor para a base do quadrado: ");
		double base = scan.nextDouble();
		System.out.println(" Introduza um valor para a altura do quadrado: ");
		int altura = scan.nextInt();
		
		double area = base*altura;
		// double area = Math.pow (lado, 2);
		double dobroArea= area *2;
		System.out.println(" Area do Quadrado é: "+area +" cm²");
		System.out.println();
		System.out.println(" O Dobro da Area do Quadrado é: "+dobroArea +" cm²");
		
		
		
	}

}
