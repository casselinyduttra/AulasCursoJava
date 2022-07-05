package com.casse.cursojava.aula17;

public class LoopSemCorpo {

	public static void main(String[] args) {
		
		// quero somar 1+2+3+4+5....
		int soma =0;	
		for( int i=1; i < 5; soma += i++);
		System.out.println("O valor da soma é: "+ soma);
			
		// posso utilizar o FOR sem as chaves
		
		//nao é legal, pois o que vai ser executado 
		//é somente o primeiro bloco de cogidos
		// a seguir o for.
		int cont;
		for( cont=1; cont < 5; cont++);
		System.out.println("o valor de i: "+ cont);

	}

}
