/*
         ***** OK ACERTEI *****
 * 08. Faca um programa que pergunte quanto voce ganha por hora
 * e o numero de horas trabalhadas no mes.
 * Calcule e mostre o total do seu salario no referido mes.
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Introduza o valor da sua Hora de trabalho ");
		double valorHora = scan.nextDouble();
		
		System.out.println(" Introduza o numero de Horas trabalhadas ");
		double numHora = scan.nextDouble();
				
		double salario = valorHora * numHora;
		
		System.out.println(" O valor da sua hora de trabalho é de " +valorHora +" €");
		System.out.println(" O numero de horas trabalhada é de " +numHora +" Hrs");
		System.out.println(" O seu Salario desse Mes é de " +salario +" €");
		
		
		

	}

}
