/*
 * 5. Faça um Programa para ler duas notas dum aluno. O programa deve calcular a média
alcançada pelo aluno e apresentar:
	a. A mensagem “Aprovado”, se a média for maior ou igual a 10;
	b. A mensagem “Reprovado”, se a média for menor de 10;
	c. A mensagem “Aprovado com Distinção”, se a média for igual a vinte;
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite a primeira Nota: ");
			double nota1 = scan.nextDouble();
		System.out.println(" Digite a segunda Nota: ");
			double nota2 = scan.nextDouble();
			
			double media= (nota1 + nota2) / 2;
			System.out.println("A media do Aluno foi: " + media);
			
			if (media >= 10 && media < 20) {
				System.out.println(" Parabens!! O aluno foi Aprovado: ");
			}else if (media < 10){
				System.out.println(" Que Pena!! O aluno foi reprovado: ");
			}else if (media == 20){
				System.out.println(" Parabens!! O aluno foi Aprovado com Distinçaõ: ");
			}

	}

}
