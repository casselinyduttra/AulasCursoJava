/*
 * Faça um programa que receba:
O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado
... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
 */
import java.util.*;
public class Ex03CalculoGastoFamiliar {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 double gastoTotal = 0.0;
		 
		System.out.println("Introduza o valor da conta de LUZ: ");
		double contaLuz = scan.nextDouble();
		
		System.out.println("Introduza o valor da conta de ÁGUA: ");
		double contaAgua = scan.nextDouble();
		
		System.out.println("Introduza o valor da conta de TELEFONE: ");
		double contaTelefone = scan.nextDouble();
		
		System.out.println("Introduza a mensalidade da ESCCOLA: ");
		double contaEscola = scan.nextDouble();
		
		System.out.println("Introduza o valor da FATURA DO CARTAO: ");
		double contaFatura = scan.nextDouble();
		
		System.out.println("Introduza o valor do MERCADO: ");
		double contaMercado = scan.nextDouble();
		
		gastoTotal += contaAgua + contaEscola +contaFatura + contaLuz + contaMercado + contaTelefone;
		System.out.println("Gastos Mensais:  " + gastoTotal);
		
	}

}
