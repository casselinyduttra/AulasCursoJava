/*
 * 4. Criar uma classe para representar uma conta corrente que possui um número, um
saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos
para realizar levantamentos (verificar se o cliente pode realizar levantamentos),
depositar dinheiro, consultar saldo e verificar se o cliente está a usar cheque especial
ou não. Desenvolva um programa para testar essa classe.
 */
package ExerciciosClasses;

public class ContaCorrente {
    
        int numConta;
	double saldoConta;
	boolean contaEspecial;
	double limiteEspecial;
        double valorEspecialUsado;
        
        
        //double qtaLevantar é um parametro
        boolean Levantamento(double qtaLevantar){
            //tem saldo na conta?
            if (saldoConta >= qtaLevantar){
                saldoConta -= qtaLevantar;
                return true;
            }else { //se nao tem saldo na conta?
                if (contaEspecial){ 
                    //verificar se o limite especial tem saldo 
                    double limite = limiteEspecial + saldoConta;
                    if (limite >= qtaLevantar){
                        saldoConta -= qtaLevantar;
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false; // nao é especial e nao tem saldo suficiente.
                }
            }
        }
        
        //metodo nao vai retornar valor nenhum
        //metodo para fazer o deposito
        //double valorDepositado é um parametro
        void depositar(double valorDepositado){
            saldoConta += valorDepositado;
        }
        
        //metodo para consultar o saldo;
        void consultarSaldo(){
            System.out.println("O Saldo atual da conta é: "+saldoConta);
        }
        //vai retornar alguma coisa
        boolean verificarUsoChequeEspecial(){
            return saldoConta < 0;
        }
}
		
