package com.casse.cursojava.aula27;

public class ContaCorrente {

	int numConta;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	boolean realizarSaque(double qtaSacar) {
		//tem saldo na conta
		if (saldo >= qtaSacar) {
			saldo -= qtaSacar;
			return true;
			//nao tem saldo na conta
		}else {
			if (especial) {
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
					if (limite >= qtaSacar) {
						saldo -= qtaSacar;
						return true;
					}else {
						return false;
					}
			}else {
				return false; // nao é especial e nao tem saldo suficiente
			}
		}
	 }
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultar() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0; // se for menor esta usando cheque
	}
}
	
	
