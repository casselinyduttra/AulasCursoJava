/*
 * **22. Faça um programa que leia 5 números e informe o maior número.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
	        
	        int numeroLido, contador=5, maior=0;
	        
	        System.out.println("Introduza um valor: ");
	        numeroLido = scan.nextInt();
	        
	        maior = numeroLido;
	        
	        for (int i = 1; i < contador; i++){
	            System.out.println("Introduza um valor: ");
	            numeroLido = scan.nextInt();
	            if (numeroLido > maior){
	                maior = numeroLido;
	            }
	        }
	        System.out.println(" O maior numero introduzido foi: " +maior);
	    }
}
