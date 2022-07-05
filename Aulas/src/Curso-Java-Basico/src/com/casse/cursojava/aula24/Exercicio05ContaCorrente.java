package com.casse.cursojava.aula24;

public class Exercicio05ContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numConta = 123456;
		conta.limite = 500;
		conta.saldoConta = 1.500;
		conta.contaEspecial = true;
		
		System.out.println("Saldo da conta " +conta.numConta +  ": "  +conta.saldoConta);
		

	}

}
