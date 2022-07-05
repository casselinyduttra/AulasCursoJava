/*
 * 55. Criar um vetor A com 10 elementos inteiros. 
Implementar um programa que defina e
escreva a soma de todos os elementos armazenados neste vetor.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
       int[] vetorA = new int[10];
       
       for (int i=0; i<vetorA.length; i++){
           System.out.print("Entre com um valor: ");
           vetorA[i] = scan.nextInt();
           
           vetorA[i] += vetorA[i];
       }
       System.out.println("Vetor A: ");
       for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
    }   
        System.out.println();
        
    }
}
