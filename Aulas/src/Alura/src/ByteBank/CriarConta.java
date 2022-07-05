package ByteBank;

public class CriarConta {

	public static void main(String[] args) {
		
		//instanciar Conta
		Conta primeiraConta = new Conta();
		
		//saldo da conta vale 200
		primeiraConta.saldo = 200;
		//acesso de um atributo de um objeto, ou seja vai 
		//acessar o saldo da primeira conta:
		System.out.println(primeiraConta.saldo);
		
		//primeiraConta = primeiraConta + 100:
		primeiraConta.saldo += 100; 
		System.out.println(primeiraConta.saldo);
		
		//criar mais uma referencia para o obejto
		//Conta atual, no caso é a segundaConta:
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;		
		System.out.println("agora a segunda conta esta" + 
				" na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}else {
			System.out.println("Contas Diferentes");
		}
	}

}
