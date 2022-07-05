/*
 * 23. Faça um programa que leia 5 números e 
informe a soma e a média dos números.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio23 {
    	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
                
                System.out.println("Introduza um valor: ");
	          int num1 = scan.nextInt();
                  System.out.println("Introduza um valor: ");
	          int num2 = scan.nextInt();
                  System.out.println("Introduza um valor: ");
	          int num3 = scan.nextInt();
                  System.out.println("Introduza um valor: ");
	          int num4 = scan.nextInt();
                  System.out.println("Introduza um valor: ");
	          int num5 = scan.nextInt();
                    
	        int soma = num1 + num2 + num3 + num4 + num5;
                double media = soma / 5;
	        System.out.println(" A soma dos numero foi: " +soma);
                System.out.println(" A media dos numero foi: " +media);
        }           
}
