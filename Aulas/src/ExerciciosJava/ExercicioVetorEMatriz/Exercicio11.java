/*
 * 59. Criar um vetor A com 10 elementos inteiros. 
Escrever um programa que calcule e escreva:
a. a soma de elementos armazenados neste vetor que são inferiores a 15;
b. a quantidade de elementos armazenados no vetor que são iguais a 15;
c. a média dos elementos armazenados no vetor que são superiores a 15
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[10];
        
        for (int i=0; i<vetorA.length; i++){
           System.out.print("Entre com um valor: ");
           vetorA[i] = scan.nextInt();       
       }
        double somaMenor15=0;
        double somaMaior15=0;
        double qtdMaior15=0;
        double igual15=0;
        
        for ( int i=0; i<vetorA.length; i++){
            if (vetorA[i] == 15){
                igual15++;
            } else if ( vetorA[i] < 15){
                somaMenor15 +=  vetorA[i];
            }else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }         
        }
        
        System.out.print("Vetor A: ");
        for ( int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos valores Inferiores a 15: " +somaMenor15);
        System.out.println("A quantidade dos valores Iguais a 15: " +igual15);
        System.out.println("A media dos Valores Superiores a 15: " +somaMaior15 / qtdMaior15);
    }
}
