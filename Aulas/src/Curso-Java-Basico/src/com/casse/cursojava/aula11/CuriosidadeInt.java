package com.casse.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1= 2147483647 ;
		int var2 = 10;
		
		// o que vai acontecer se somar o valor inteiro permitido
		//pela variavel int? :
		//nao vai dar ERRO, pois os numeros em JAVA funciona igual uma roleta
		// no momento em que pego o numero limite e somo com alguma coisa ele vai retornar pro numero limite negativo
		System.out.println(var1+var2);
		

	}

}
