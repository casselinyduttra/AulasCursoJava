/*
 * 3. Faça um Programa que verifique se uma letra colocada é “F” ou “M”. Conforme a letra
que escrever aparece o seguinte no ecrã:
a. F – Feminino
b. M – Masculino
c. Sexo Inválido
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite seu Sexo < F-Feminino M-Masculino>: ");
		 	String sexo = scan.next();

		 	if (sexo.equalsIgnoreCase("F")) {
		 		System.out.println(" Feminino");
		 	} else if (sexo.equalsIgnoreCase("M")) {
		 		System.out.println(" Masculino");
		 	  } else {
		 		 System.out.println(" Sexo Invalido"); 		
		 	}
	}
}
