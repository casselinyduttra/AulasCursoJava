package com.casse.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1= falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);

		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
		
		/*essa é a ordem de precedendia:
		1*1=1
		1/1=1
		1+1=2
		2-1=1
		1+1=2*/
	}

}
