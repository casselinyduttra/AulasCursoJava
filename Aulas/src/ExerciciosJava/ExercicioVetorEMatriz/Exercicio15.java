/*
 * 63. Criar um vetor A com 5 elementos inteiros. 
Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A..
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] tabuada = new int[5];
        
        for (int i=0; i<tabuada.length; i++){
            System.out.println("Introduza um numero " + (i+1) + " : ");
            tabuada[i] = scan.nextInt();
        }
        
        for (int i=0; i<tabuada.length; i++){
            System.out.println("Tabuada de " + tabuada[i] + " : ");           
           
        for (int j=0; j<=10; j++){
            System.out.println(tabuada[i] + " * " + j + " = " +(tabuada[i]*j));
        }
           System.out.println();
        }      
    }
}
