
/*
 * o programa vai contar de 1 ate 10.
 */
package com.casse.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i= 1; //contador
		int max=10;
		
		System.out.println("Contando ate: " +max);
		
		//enquanto i for menor que max.
		// primeiro avalia a expressao e depois executa o 
		//bloco de codigos.
		while(i <max) {
			System.out.println("o valor de i: " +i);
			i++; // i= i +1; ou i+=1;			
		}
		
		System.out.println("o valor de i: " +i);
		//o i vai sair com o valor de 11.
		
		// faca enquanto i for < 13
		//primeiro ele vai executar o bloco de codigo e depois avaliar 
		// o bloco, caso a expressao for falsa ele nao volta mais no faca(do)
		
			do {
				i++;
				System.out.println("o valor de i: " +i);
			}while (i < 13);
			System.out.println("o valor de i: " +i);
		}
	}


/* enquanto i foir menor que 10 vai fazer o comando.
 * 1 é menor que 10? Sim, entao imprime o valor de i que é 1 e
 * incrementa + 1 em i que vai passar a ser 2
 * 2 é menor que 10? Sim, entao imprime o valor de i que é 2 e
 * incrementa + 1 em i que vai passar a ser 3
 * 3 é menor que 10? Sim, entao imprime o valor de i que é 3 e
 * incrementa + 1 em i que vai passar a ser 4
 * 4 é menor que 10? Sim, entao imprime o valor de i que é 4 e
 * incrementa + 1 em i que vai passar a ser 5
 * 5 é menor que 10? Sim, entao imprime o valor de i que é 5 e
 * incrementa + 1 em i que vai passar a ser 6
 * 6 é menor que 10? Sim, entao imprime o valor de i que é 6 e
 * incrementa + 1 em i que vai passar a ser 7
 * 7 é menor que 10? Sim, entao imprime o valor de i que é 7 e
 * incrementa + 1 em i que vai passar a ser 8
 * 8 é menor que 10? Sim, entao imprime o valor de i que é 8 e
 * incrementa + 1 em i que vai passar a ser 9
 * 9 é menor que 10? Sim, entao imprime o valor de i que é 9 e
 * incrementa + 1 em i que vai passar a ser 10
 * 10 é menor ou igual a 10? Sim, entao imprime o valor de i que é 10 e
 * incrementa + 1 em i que vai passar a ser 11
 * 11 é menor que 10? Nao, entao o loop vai dar negativo, e a execucao
 * do while vai parar.
 */
