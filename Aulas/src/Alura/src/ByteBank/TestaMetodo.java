package ByteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta/*variavel*/ = new Conta ();
		
		conta.saldo = 100;
		conta.deposita(50);		
		System.out.println(conta.saldo);
		
		boolean consegiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(consegiuRetirar);
		
		Conta contaMarcela = new Conta();	
		contaMarcela.deposita(1000);
		
		//pode ser assim:
		boolean sucessoTransferencia = 
				contaMarcela.transfere(300, conta);
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Nao tem dinheiro");
		}
		
		//ou pode fazer assim:
		if(contaMarcela.transfere(300, conta)) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Nao tem dinheiro");
		}
		System.out.println(contaMarcela.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Paulo Silveira";
		System.out.println(conta.titular);
		
	}

}
