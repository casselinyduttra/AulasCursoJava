/*
 * 11. Faça um Programa que peça os 3 lados de um triangulo. O programa devera informar
se os valores poder ser um triangulo. Indique, caso os lados formem um triangulo, se o
mesmo é: equilátero, isósceles ou escaleno.
a. Triangulo equilátero – três lados iguais;
b. Triangulo isósceles – dois lados iguais;
c. Triangulo escaleno – três lados diferentes;
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println(" Introduza o primeiro lado: ");
	        double lado1 = scan.nextDouble();
	        System.out.println(" Introduza o segundo lado: ");
	        double lado2 = scan.nextDouble();
	        System.out.println(" Introduza o terceiro lado: ");
	        double lado3 = scan.nextDouble();
	        
	        if ((( lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1)){
	        	
	         	if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
	        	System.out.println("Triangulo Equilatero");
	        }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
	        	System.out.println("Triangulo Escaleno");
	        } else if ( lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	        	System.out.println("Triangulo Isoceles");
	        }
	        else {
	        	System.out.println("Nao forma um triangulo.");
	        }
	        } 	
	}

}
