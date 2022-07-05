/*
 * 53. Criar dois vetores A e B cada um com 10 elementos inteiros. 
Construir um vetor C,onde cada elemento de C é a 
soma dos respetivos elementos em A e B, ou seja: 
C[i] = A[i] + B[i]
 */
package ExerciciosJava.ExercicioVetorEMatriz;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio05 {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
       int[] vetorA = new int[10];
       int[] vetorB = new int[vetorA.length];
       int[] vetorC = new int[vetorB.length];
       
       for (int i=0; i<vetorA.length; i++){
           System.out.print("Entre com um valor: ");
           vetorA[i] = scan.nextInt();
           
           System.out.print("Entre com um valor: ");
           vetorB[i] = scan.nextInt();
           
           vetorC[i] = vetorA[i] + vetorB[i];
       }
       
       System.out.println("Vetor A: ");
       for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
    }
    
    System.out.println();
    
    System.out.println("Vetor B: ");
       for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
    }
    System.out.println();

    System.out.println("Vetor C: ");
       for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorC[i] + " ");
    }
    System.out.println();
        
    }
}
