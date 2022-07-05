/*
 * 21. Supondo que a população de um país A ronda os 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B ronda os 200000 habitantes com
uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número
de anos necessários para que a população do país A ultrapasse ou igual a população do
país B,
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args){
       // Scanner scan = new Scanner(System.in);
        
        double habA = 80000, habB = 200000;
        int tempoAno = 0;
        
                      
        while ( habA <= habB){
            habA = habA + ( habA /100) *3 ; 
            habB = habB + ( habB /100) *1.5; 
                tempoAno++; 
        }
        System.out.println(" Habitantes de A: " + habA);
        System.out.println(" Habitantes de B: " + habB);
        System.out.println(" Foi necessario " + tempoAno + " Anos " + " para os Habitantes de A ultrapassarem os Habitantes de B.");
    }
}
