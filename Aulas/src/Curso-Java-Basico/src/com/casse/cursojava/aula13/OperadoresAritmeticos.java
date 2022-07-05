package com.casse.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1+2;
		System.out.println(resultado);
		
		resultado = resultado -1;
		System.out.println(resultado);
		
		resultado = resultado *2;
		System.out.println(resultado);
		
		resultado = resultado /2;
		System.out.println(resultado);
		
		resultado = resultado +8;
		System.out.println(resultado);
		
		resultado = resultado %7;
		System.out.println(resultado);
		
		//existem outras maneiras de fazer string concatenada
		// essa nao e muito legal de usar.
		String nome = "esta é ";
		String nome2 = "uma String concatenada";
		String nome3 = nome + nome2;
		System.out.println(nome3);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++; // significa que estou adicionando +1;
		// é a mesma coisa do exemplo de cima
		System.out.println(resultado);
		
		//5 - estou pedindo pra imprimir o valor de resultado e depois adicionar mais 1
		//por isso da 5
		System.out.println(resultado++);
		//seria a mesma coisa de:
		resultado = resultado + 1;
		//ou
		resultado +=1;
		
		//7 - estou pedindo primeiro pra adicionar o valor na string pra depois
		// eu fazer o output dela.
		System.out.println(++resultado);
		// seria a mesma coisa de:
		resultado +=1;
		// e depois imprimir o resultado
		System.out.println(resultado);
		
		//5 - estou retirando 1 do resultado
		resultado--;
		System.out.println(resultado);
		
		//primeiro estou retirando um para depois imprimir.
		System.out.println(resultado--);
		
		// 
		System.out.println(--resultado);
		
		

	}

}
