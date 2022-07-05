/*
 * 62. Ler um vetor A com 20 elementos. 
Construir dois vetores B e C, sendo que no vetor B e
C serão armazenados os valores pares e ímpares de A, 
respetivamente.
 */
package ExerciciosJava.ExercicioVetorEMatriz;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
             
        int[] vetorA = new int[20];
        int[] vetorBPar = new int[vetorA.length];
        int[] vetorCImpar = new int[vetorA.length]; 
        
        for (int i=0; i<vetorA.length; i++){          
            System.out.println("iNTRODUZA UM VALOR " + i + " : ");
            vetorA[i] = scan.nextInt();
        }
        
        int posB = 0;
        int posC = 0;
        
        for (int i=0; i<vetorA.length; i++){       
            if (vetorA[i] % 2 == 0){
                vetorBPar[posB] = vetorA[i];
                posB++;
            } else {
               vetorCImpar[posC] = vetorA[i];
                posC++; 
            }
        }
        
        System.out.print("Vetor A: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
               
        System.out.print("Vetor B Pares: ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorBPar[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C Impares: ");
        for (int i=0; i<posC; i++){
            System.out.print(vetorCImpar[i] + " ");
        }
        System.out.println();
    }    
}
