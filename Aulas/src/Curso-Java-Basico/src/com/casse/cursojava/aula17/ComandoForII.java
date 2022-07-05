package com.casse.cursojava.aula17;

public class ComandoForII {

	public static void main(String[] args) {
		
		//for com mais de uma variavel:
		// separamos usado a "," 
		
		for (int i =1, j=10; i < j; i++, j--) {
			System.out.println("i:"+i +"; j:" +j );
		}
		System.out.println();

		//outra forma de usar o FOR:
		//partes ausentes:
		
		int i = 0;
		for(; i < 10 ;) {
			System.out.println("i tem valor: " +i);
			i +=2;
		}
		System.out.println();
		//mesma coisa de:
		
		for(int cont=0; cont <10; cont+=2) {
			System.out.println("O valor de cont: " +cont);		
		}
	}

}
