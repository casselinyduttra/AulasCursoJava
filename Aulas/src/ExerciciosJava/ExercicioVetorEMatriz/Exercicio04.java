/*
 *52. Criar um vetor A com 15 elementos inteiros. 
Construir um vetor B do mesmo tamanho,
sendo que cada elemento do vetor B deverá ser a raiz 
quadrada do respetivo elemento
de A, ou seja: B[i] = sqrt(A[i]).
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
       public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
        
       int[] vetorA = new int[15];
       double [] vetorB = new double[vetorA.length];
       
       for (int i=0; i<vetorA.length; i++){
           System.out.println("Entre com um valor " + i);
           vetorA[i] = scan.nextInt();
           
           vetorB[i] = Math.sqrt(vetorA[i]);
       }
       System.out.println("Vetor A: ");
       for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
    }
    
    System.out.println();
    DecimalFormat df = new DecimalFormat ("###,###.##");
    System.out.println("Vetor B: ");
       for (int i=0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
    }
    System.out.println();
}
}