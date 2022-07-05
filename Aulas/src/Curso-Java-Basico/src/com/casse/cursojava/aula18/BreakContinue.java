package com.casse.cursojava.aula18;
import java.util.Scanner;
public class BreakContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
	
		// Comando Breack;
		//usado principalmente para saida de loops
		//pode ser usado juntamente com o rotulo(label)
		
		
		//sair de um loop:
		 System.out.println("Entre com um numero: ");
		 int num = scan.nextInt();
		 
		 System.out.println("Entre com o limite: ");
		 int max = scan.nextInt();
		 
			for (int i=num; i<=max; i++){			
				if (i % 7 == 0) {
					System.out.println("O valor de i é: "+i);
					break;
					//vai me mostrar o 1 numero divisivel por7
					//apos a primeira entrada do numero.
					// se eu tirar o break, ele vai me mostrar todos os
					//numeros divisiveis por 7 no intervalo do 
					//primeiro numero digitado ate o limite digitado.
				}
			}
			
		//comando Continue:
		//complemento o break
		//continua o loop na proxima iteracao
			
			for (int i=num; i<=max; i++){			
				if (i % 7 == 0) {
					System.out.println("O valor de i é: "+i);
					continue;
	// o continue vai imprimir o valor de i todas as vezes que entrar no for
	// porem nao quero imprimir os numeros que forem multiplo de 7
				}
			}
	}

}


