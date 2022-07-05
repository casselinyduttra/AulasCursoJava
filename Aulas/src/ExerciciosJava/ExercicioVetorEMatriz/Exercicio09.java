/*
 * 57. Criar um vetor A com 10 elementos inteiros. 
Implementar um programa que defina e
escreva a média aritmética simples dos elementos ímpares 
armazenados neste vetor.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[10];
        
        for (int i=0; i<vetorA.length; i++){
           System.out.print("Entre com um valor: ");
           vetorA[i] = scan.nextInt();
       
       }
       double soma = 0 , impar=0;
       
       for (int i=0; i<vetorA.length; i++){;
       if ( vetorA[i] %2 !=0){
           soma = soma + vetorA[i];
       }
           impar++;
       }
       System.out.print("Vetor A: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();
        System.out.println("Soma: " +soma);
        System.out.println("Media: " +(soma/impar));
        
    }
}
