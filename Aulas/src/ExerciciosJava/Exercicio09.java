/*
 * 9. Faça um Programa que leia três números e mostre-os em ordem decrescente
 */
package ExerciciosJava;

import java.util.Scanner;

/**
 *
 * @author casse
 */
public class Exercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Introduza um numero: ");
        int num1 = scan.nextInt();
        System.out.println(" Introduza o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println(" Introduza o terceiro numero: ");
        int num3 = scan.nextInt();
        
        System.out.println(" Primeiro: " + num1 + " Segundo: " + num2 + " Terceiro: " + num3);
        int x;
        
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println(num3 + " - " + num2 + " - " + num1);
        }
        else if (num1 <= num2 && num1 <= num3 && num3 <= num2 ){
            System.out.println(num2 + " - " + num3 + " - " + num1);

        }
        else if ( num2 <= num1 && num2 <= num3 && num1 <= num3){
            System.out.println(num3 + " - " + num1 + " - " + num2);
       }
        else if ( num2 <= num1 && num2 <= num3 && num3 <= num1){
            System.out.println(num1 + " - " + num3 + " - " + num2);        
        }
        else if ( num3 <= num1 && num3 <= num2 && num1 <= num2){
            System.out.println(num2 + " - " + num1 + " - " + num3);      
        }
        else if ( num3 <= num1 && num3 <= num2 && num2 <= num1){
            System.out.println(num1 + " - " + num2 + " - " + num3);
     
        }
    }   
}
