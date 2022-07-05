/*
 * Comandodentro de um bloco IF somente sao executados se a condicao for verdadeira.
 * Se a condicao for falsa, os comando nao sao executados.
 * 
 */

package com.casse.cursojava.aula14;

import java.util.Scanner;

public class ComandoIf {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean temBatata =true;
		
		int ovos = 6;
		
		if(temBatata) {
			ovos=9;
		}
		
		System.out.println(" Compre " + ovos + " ovos ");
		
		// outro exemplo
			
		System.out.println(" Digite sua idade: ");
		 int idade = scan.nextInt();
		 
		 if (idade >= 18) {
				System.out.println(" É maior de idade ");			
		}

	}

}
