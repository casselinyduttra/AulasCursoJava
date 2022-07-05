//duas contas diferentes
package ByteBank;

public class TesteDeReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: "+ segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta "+segundaConta.saldo);
		
		System.out.println("Saldo primeira conta: "+ primeiraConta.saldo);
		
		//testar p saber se sao a mesma conta
		if(primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}
	}

}
