/*
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e
tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
 */
package com.casse.cursojava.aula19;

import java.util.Scanner;

public class ArrayExercicio01 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        int[] vetorA = new int[5];
	        int[] vetorB = new int[vetorA.length];
	        
	        for (int i = 0; i < vetorA.length; i++) {
	        	System.out.println("Entre com um valor");
	        	vetorA[i] = scan.nextInt();
	        	
	        	vetorB[i] = vetorA[i];
	        	}

	        	System.out.println("VETOR A:");
	        	for (int i = 0; i < vetorA.length; i++) {
		        	System.out.print(vetorA[i] + "");
	        	}
	        	System.out.println("VETOR B:");
	        	for (int i = 0; i < vetorB.length; i++) {
		        	System.out.print(vetorB[i] + "");
	        	}
	}

}
