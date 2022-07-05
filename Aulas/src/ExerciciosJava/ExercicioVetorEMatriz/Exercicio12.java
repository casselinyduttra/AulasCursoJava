/*
 * 60. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de
pessoas. Escreva um programa que determine e escreva a menor e a maior idades e
suas respetivas posições.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        for (int i=0; i<idades.length; i++){
           System.out.print("Escreva a Idade da " +i + " pessoa:");
           idades[i] = scan.nextInt();       
       }
        
        int maior = idades[0];
        int posMaior=0;
        int menor = idades[0];
        int posMenor=0;
   
        for ( int i=1; i<idades.length; i++){
            if (idades[i] > maior){
                maior = idades[i];
                posMaior = i;
            } else if ( idades[i] < menor){
                menor = idades[i];
                posMenor = i;
            }  
        }
        
        System.out.print("Vetor de idades ");
        for ( int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        System.out.println("A maior Idade é: " +maior +" Anos");
        System.out.println("A posicao da maior Idade: " +posMaior);
        System.out.println("A menor Idade é: " +menor + " Anos");
        System.out.println("A posicao da menor Idade: " +posMenor);
     }  
}

