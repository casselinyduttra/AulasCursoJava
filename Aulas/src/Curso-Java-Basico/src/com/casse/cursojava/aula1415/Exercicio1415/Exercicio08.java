/*
 * 8. Faça um Programa que pergunte o preço de três produtos e informe qual o produto
	deve comprar, sabendo que a decisão é sempre pelo mais barato
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o valor do Casaco: ");
			int casaco = scan.nextInt();
		System.out.println(" Digite o valor do Calça: ");
			int calca = scan.nextInt();
		System.out.println(" Digite o valor do tenis: ");
			int tenis = scan.nextInt();

		int barato;	
		
			if (casaco < calca) {
				barato = casaco;
			}else if (calca < tenis) {
				barato = calca;
			}else {
				barato = tenis;
			}
			
			System.out.println("O produto que deve comprar é de " +barato + " €");
	}

}
