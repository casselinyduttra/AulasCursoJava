package com.casse.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: "+ nomeCompleto);
		
		System.out.println(" Digite seu primeiro nome : ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: "+ primeiroNome);
		
		System.out.println(" Digite a sua idade : ");
		int idade = scan.nextInt();
		System.out.println(" sua idade é: " +idade);
		
		System.out.println(" Digite a sua altura : ");
		double altura = scan.nextDouble();
		System.out.println(" sua altura é: " +altura);
		
		System.out.println(" Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pets: ");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		System.out.println("voce digitou os seguintes valores: ");
		System.out.println("seu nome: "+ primeiroNome2);
		System.out.println(" sua idade: "+ idade2);
		System.out.println("qtd filhos: "+ qtdFilhos);
		System.out.println("sua altura: "+ altura2);
		System.out.println("tem pets?: "+ temPet);

	}

}
