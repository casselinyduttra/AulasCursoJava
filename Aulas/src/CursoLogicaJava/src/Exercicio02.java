/*
 * Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
 * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00
   Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
 */
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorFinal=0;
		System.out.println("Digite o valor do produto: ");
		double produto = scan.nextDouble();
		
		if (produto >= 100 ) {
			valorFinal = produto;
		}else   {
			valorFinal = produto + 15;
		}
		
		System.out.println("o Valor final do produto: " +valorFinal);
		
	}

}
