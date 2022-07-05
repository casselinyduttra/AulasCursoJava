/*
 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência, 
 * depois verifique se ela pode aposentar ou não.
 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos. 
 * Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */
import java.util.*;
public class Ex04VerificarPossibilidadeDeAposentadoria {

	public static void main(String[] args) {
		Scanner scan = new Scanner  (System.in);
		
		System.out.println("Introduza sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Introduza o tempo de contribuição: ");
		int tempoContribuicao = scan.nextInt();
		
		Boolean idadeMinima = idade >= 55;
		Boolean contribuicaoMinima = tempoContribuicao >= 25;
		
		Boolean podeAposentar = idadeMinima && contribuicaoMinima;
		
		if (podeAposentar) {
			System.out.println("Parabéns sua Aposentadoria foi Validade");
		}else {
			System.out.println("Infelizmente não cumpre os requisitos.");
		}
		

	}

}
