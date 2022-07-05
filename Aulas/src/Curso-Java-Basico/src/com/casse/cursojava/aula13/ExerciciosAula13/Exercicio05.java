/*
               **** OK ACERTEII *****
 * 05. Faca um programa que comverta metros em centimetros.
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double metro;
		double cent=0;
		
		System.out.println(" Introduza quantos metros deseja transformar em centimetros: ");
		metro = scan.nextDouble();
		
	    cent = metro * 100;
		
		System.out.println(metro + " metros é igual a " +cent + " centimetros");
		
		
		
		
	}

}
