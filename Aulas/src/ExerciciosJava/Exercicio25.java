/*
 *25. Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo entre eles.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduza um valor de inico: ");
            int comeco = scan.nextInt();
        System.out.println("Introduza um valor de fim: ");
            int fim = scan.nextInt();
        
        for (int i = comeco; i <= fim; i++){
            System.out.println(i);
        }
    }
}
