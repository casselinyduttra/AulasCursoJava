/*
 * executa um bloco de codigo que esta dentro do comando for 
 * enquanto uma expressao for verdadeira.
 * é bastante utilizada na programacao.
 */
package com.casse.cursojava.aula17;

public class ComandoFor {

	public static void main(String[] args) {
		
		//for "normal": atualizacao da variavel inicializada
		// i = contador
		
		for (int i = 0; i < 5; i++ ) {
			System.out.println("i tem valor: " +i);
			// vai imprimir do 0 ao 5
		}		
		for (int i = 1; i < 5; i++ ) {
			System.out.println("i tem valor: " +i);
			// vai imprimir do 1 ao 5
		}
		for (int i = 5; i > 0; i-- ) {
			System.out.println("i tem valor: " +i);
			// vai imprimir do 5 ao 1
			
			// a variavel inicializada dentro do for
			//ela so vai poder ser usada somente dentro do for
			//caso queira utiliza-la no resto do codigo,tem que 
			//inicializar antes de comecar o for.
		}
	}

}
