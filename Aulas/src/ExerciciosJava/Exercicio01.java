/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o primeiro numero: ");
		 	int numero1 = scan.nextInt();
		System.out.println(" Digite o segundo numero: ");
		 	int numero2 = scan.nextInt();

		 	if ( numero1 > numero2) {
		 		System.out.println("o numero " + numero1 + "é o maior");
		 	}else {
		 		System.out.println("o numero " + numero2 + " é o maior");
		 	}
	}
}
