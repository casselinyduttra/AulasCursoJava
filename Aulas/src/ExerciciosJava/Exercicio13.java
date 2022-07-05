/*
 * 13. Faça um programa que peça um número correspondente a um determinado ano e em
seguida diga se o ano é bissexto ou não.
 */
package ExerciciosJava;

import java.util.Scanner;

/**
 *
 * @author casse
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Introduza um ANO: "); 
        int ano = scan.nextInt();
        
        if ((ano % 400 == 0) || ( ano % 4 == 0 && ano % 100 != 0)){
            System.out.println(" O ano " + ano + " é um ano Bissexto!! ");  
        }
        else {
            System.out.println(" o ano " + ano + " é um ano Comum!!");
        }
    }  
}
