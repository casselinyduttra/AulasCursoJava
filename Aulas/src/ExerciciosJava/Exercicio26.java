/*
 * 26. Altere o programa anterior para mostrar no final a soma dos números.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio26 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduza um valor de inico: ");
            int comeco = scan.nextInt();
        System.out.println("Introduza um valor de fim: ");
            int fim = scan.nextInt();
            
        int soma = 0;
        for (int i = comeco; i <= fim; i++){
            System.out.println(i);
            soma += i;
            
        }  
            System.out.println(" a soma dos numeros: " +soma);
        
    }
}
