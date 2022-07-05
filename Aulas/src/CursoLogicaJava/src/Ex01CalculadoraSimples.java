/*
 * Para criar uma calculadora simples você vai precisar receber três informações pelo console. 
 * São os dois números que participarão da operação e também a operação que será realizada.
 * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
 * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. 
 * Para receber a operação você pode receber também um número que vai indicar a mesma. 
 * Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.
 * Com esses três valores - os dois números e qual será a operação - 
 * você pode utilizar a estrutura de decisão if para só realizar a operação que o usuário escolheu. 
 * Se estiver com dúvidas, então volte a aula onde falamos sobre alteração do valor de uma variável - aula 3.10.
 */

import java.util.Scanner;
public class Ex01CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Numero 01: ");
		double num1 = scan.nextDouble();
		System.out.print("Numero 02: ");
		double num2 = scan.nextDouble();
		System.out.print("Escolha a operacao: < 1-Adicao 2-Subtracao 3-Multiplicacao 4-Divisao 5-Modulo > ");
		int operacao = scan.nextInt();
		
		if (operacao == 1) {
			System.out.println("Adicao do " +num1 + " + " + num2 +": " + (num1 + num2));
		}else if (operacao == 2) {
			System.out.println("Subtracao do " +num1 + " - " + num2 +": "+ (num1 - num2));		
		}else if (operacao == 3) {
			System.out.println("Multiplicacao do " +num1 + " * " + num2 +": "+ (num1 * num2));
		}else if (operacao == 4) {
			System.out.println("Divisao do " +num1 + " / " + num2 +": " + (num1 / num2));
		}else if (operacao == 5) {
			System.out.println("Modulo do " +num1 + " % " + num2 +": " + (num1 % num2));
		}
		
	}

}
