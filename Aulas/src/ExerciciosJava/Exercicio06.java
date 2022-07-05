/*
 * 6. Faça um Programa que leia três números e mostre o maior deles
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o primeiro numero: ");
			int numero1 = scan.nextInt();
		System.out.println(" Digite o segundo numero: ");
			int numero2 = scan.nextInt();
		System.out.println(" Digite o terceiro numero: ");
			int numero3 = scan.nextInt();
		
		int maior;	
			
			if (numero1 > numero2) {
				maior = numero1;
			}else if (numero2 > numero3) {
				maior = numero2;
			}else {
				maior = numero3;
			}

			System.out.println(" O maior numero digitado foi: " +maior);
			
	}
}
