package com.casse.cursojava.aula27;


public class Exercicio02ContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numConta = 123456;
		conta.saldo = -10;
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		System.out.println("Saldo da conta " +conta.numConta +  ": "  +conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
			if (saqueEfetuado) {
				System.out.println("Saque efetuado com sucesso");
				conta.consultar();
			}else {
				System.out.println("Nao foi possivel realizar o saque, Saldo insuficiente");
			}
			
			saqueEfetuado = conta.realizarSaque(500);
			System.out.println("Tentativa de saque de 500 reais");
			if (saqueEfetuado) {
				System.out.println("Saque efetuado com sucesso");
				conta.consultar();
			}else {
				System.out.println("Nao foi possivel realizar o saque, Saldo insuficiente");
			}
			
			System.out.println("Deposito de 500 reais");
			conta.depositar(500);
			conta.consultar();
			
			
			if (conta.verificarUsoChequeEspecial()) {
				System.out.println("Esta usando cheque especial");
			}else {
				System.out.println("Nao esta usando cheque especial");
			}
			
			conta.realizarSaque(600);
			conta.consultar();
			if (conta.verificarUsoChequeEspecial()) {
				System.out.println("Esta usando cheque especial");
			}else {
				System.out.println("Nao esta usando cheque especial");
			}

	}

}
