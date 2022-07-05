/*
 *  27. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
inteiro. O utilizador deve informar o número que deseja ver a tabuada.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Tabuada do numero: ");
        int num = scan.nextInt();
      
        for (int i=1; i <= 10; i++ ){
            System.out.println(+ num + " * " + i + " = " + num*i);
            
        }
    }
}
