/*
 * 02. 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
    negativo.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite um numero: ");
		 	int numero = scan.nextInt();

		 	if ( numero >= 0) {
		 		System.out.println(" o numero " + numero + " é positivo");
		 	} else {
		 		System.out.println(" o numero " + numero + " é negativo");
		 	}
	}
}
