/*
 * 56. Criar um vetor A com 10 elementos inteiros. 
Implementar um programa que
determine a soma dos elementos armazenados neste vetor 
que são múltiplos de 5.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio08 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
       int[] vetorA = new int[10];
       
       for (int i=0; i<vetorA.length; i++){
           System.out.print("Entre com um valor: ");
           vetorA[i] = scan.nextInt();
       
       }
       int soma = 0;
       for (int i=0; i<vetorA.length; i++){;
       if ( vetorA[i] %5 ==0){
           soma = soma + vetorA[i];
       }
            
    }   
        System.out.println("Vetor A: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();
        System.out.print("Soma: " +soma);
    }
}
