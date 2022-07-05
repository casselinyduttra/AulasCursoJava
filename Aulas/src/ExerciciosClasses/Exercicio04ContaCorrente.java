/*
 * 4. Criar uma classe para representar uma conta corrente que possui um número, um
saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos
para realizar levantamentos (verificar se o cliente pode realizar levantamentos),
depositar dinheiro, consultar saldo e verificar se o cliente está a usar cheque especial
ou não. Desenvolva um programa para testar essa classe.
 */

package ExerciciosClasses;

public class Exercicio04ContaCorrente {
     public static void main(String[] args){
         
    ContaCorrente conta = new ContaCorrente();
		
		conta.numConta = 25060;
		conta.limiteEspecial = 1000;
		conta.saldoConta = 3500;
		conta.contaEspecial = true;
                conta.valorEspecialUsado = 0;
		
		System.out.println("Saldo da conta "+conta.numConta +  " : "  +conta.saldoConta + " €" );
                
                boolean levantamentoEfetuado = conta.Levantamento(10);
                
                if (levantamentoEfetuado){
                    System.out.println("Levantamento efetuado com sucesso");
                    conta.consultarSaldo();
                }else {
                    System.out.println("Nao é possivel fazer o levantamento, Saldo Indisponivel.");
                }
                
                levantamentoEfetuado = conta.Levantamento(100);
                
                System.out.println("Tentativa de levantamento de 100 €.");
                 if (levantamentoEfetuado){
                    System.out.println("Levantamento efetuado com sucesso");
                    conta.consultarSaldo();
                }else {
                    System.out.println("Nao é possivel fazer o levantamento, Saldo Indisponivel.");
                }
                 
                System.out.println("Deposito de 500€");
                conta.depositar(500);
                conta.consultarSaldo();
                
                if (conta.verificarUsoChequeEspecial()){
                    System.out.println("Esta usando cheque especial");
                }else {
                    System.out.println("Nao esta usando cheque especial.");
                }
     }
}
