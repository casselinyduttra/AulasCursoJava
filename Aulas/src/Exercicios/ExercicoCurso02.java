/*
 Leia um número no console e depois faça o cálculo do quadrado desse número 
e exiba o resultado no console. Lembrando que o quadrado de um número é 
calculado multiplicando-se o número por ele mesmo. Por exemplo, 
para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, 
tendo como resultado o número 4.

 */
package Exercicios;
import java.util.Scanner;
public class ExercicoCurso02 {
    public static void main( String[] args){
       Scanner scan = new Scanner (System.in);
        
          System.out.println(" Coloque o Numero: ");
          int numero = scan.nextInt();
          
          int quadrado = numero * numero;
          System.out.println("O quadrado do numero " + numero + " é igual a: " + quadrado);
       
    }
}
