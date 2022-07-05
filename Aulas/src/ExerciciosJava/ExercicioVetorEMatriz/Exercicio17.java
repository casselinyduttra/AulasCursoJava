/*
 * 65. Gerar e imprimir uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso
indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da
coluna 7.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
import java.util.Random;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
         int [][] num = new int [10][10];
        
        Random numAleatorios = new Random();
        
        for(int i = 0; i < num.length; i++){
            for ( int j =0; j < num[i].length; j++ ){
                num[i][j] = numAleatorios.nextInt(10); 
            }
            System.out.println();
        }
        
        int maiorL5=0;
        int menorL5=101;
        int linha5=5;
        
        for(int i = 0; i < num.length; i++){
                if (num[linha5][i] > maiorL5){
                    maiorL5 = num[linha5][i];
                } 
                if (num[linha5][i] < menorL5){
                    menorL5 = num[linha5][i];
                } 
            }
        
            System.out.println();
         
    
        System.out.println();
        System.out.println("Maior da linha5: " + maiorL5);
        System.out.println("Menor da linha5: " + menorL5);
        
        
        int maiorC7=0;
        int menorC7=101;
        int coluna7=7;
        
        for(int i = 0; i < num.length; i++){
                if (num[i][coluna7] > maiorC7){
                    maiorL5 = num[i][coluna7];
                } 
                if (num[i][coluna7] < menorC7){
                    menorC7 = num[i][coluna7];
                } 
            }
        
            System.out.println();
         
        System.out.println();
        System.out.println("Maior da linha7: " + maiorC7);
        System.out.println("Menor da linha7: " + menorC7);
        
        
    }
}
