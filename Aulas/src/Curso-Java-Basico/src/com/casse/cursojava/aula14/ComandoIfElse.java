/*
 * Comandos dentro de um bloco ELSE somente sao
 * executados se a condicao do IF for falsa.
 *  se (condicao nao for verdadeira ) - se nao imprime algo
 */


package com.casse.cursojava.aula14;

import java.util.Scanner;

public class ComandoIfElse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite sua idade: ");
		 int idade = scan.nextInt();
		 
		 if (idade >= 18) {
				System.out.println(" É maior de idade ");			
		} else {
			System.out.println(" Não é maior de idade ");
		}
		 
		 // é possivel ter varios if- elses
		 // exemplos:
		 
		 //barato <= 10
		 // entre 10 e entre 15 - pedir desconto
		 // 15 <= 17 - pesquisar mais
		 // >= 17 - muito caro 
		 
		 System.out.println(" Digite um valor: ");
		 double valor = scan.nextDouble();
		 
		 if (valor <= 10) {
			 System.out.println(" Esta barato, pode comprar");
		 } else if (valor > 10 && valor < 15) {
			 System.out.println(" Pode pedir um desconto");
		 } else if ( valor >= 15 && valor < 17) {
			 System.out.println(" Voce pode pesquisar um pouco mais");
		 } else { // aqui se diz que o valor é >= 17
			 System.out.println(" Esta muito caro, nao compre");
		 }

	}

}
