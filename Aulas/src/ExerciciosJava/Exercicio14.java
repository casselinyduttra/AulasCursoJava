/*
 * 14. Faça um programa que peça um número inteiro e determine se ele é par ou ímpar.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduza um numero: ");
        int numero = scan.nextInt();
        
        if ( numero %2 ==0 ){
        System.out.println("O numero introduzido é um numero PAR ");
    }
        else{
               System.out.println("O numero introduzido é um numero IMPAR "); 
        }
            
    }
}
