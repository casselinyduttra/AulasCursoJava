
public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int adicao = 1 + 1;
		System.out.println("Adicao: "+adicao);
		int subtracao = 1 - 1;
		System.out.println("Subtracao: "+subtracao);
		int multiplicacao = 2 * 2;
		System.out.println("Multiplicacao: "+multiplicacao);
		int divisao = 4 / 2;
		System.out.println("Divisao: "+divisao);

		int modulo = 7 % 4;
		System.out.println("Modulo: "+modulo);
		// 7 dividido por 4: 1 e resta 3 
		//o valor do modulo (%) é 3.
		
		int modulo2 = 5 % 4;
		System.out.println("Modulo: "+modulo2);
		// 7 dividido por 4: 1 e resta 1 
		//o valor do modulo (%) é 1.
		
		int modulo3 = 4 % 2;
		System.out.println("Modulo: "+modulo3);
		// 4 dividido por 2: 2 e resta 0 
		//o valor do modulo (%) é 0.
		
		/*
		 * Precedência:
		 * 1º é a multiplicacao, devisao e modulo sao avaliados primeiro.
		 * Havendo mais de um, eles serao avaliados da esqueda para direita;
		 * 2º Depois vem a adicao e subtracao. Também, havendo mais de um, eles
		 * serao avaliados da esquerda para direita.
		 */
		
		//Exemplos:
		
		int precedencia01 = 1 + 1 * 5;
		// vai multiplicar o 5 * 1, depois o resultado 5 é somado com 1 dando 6.
		// para somar primeiro é so colocar 1 + 1 entre parenteses:
		System.out.println("Precedencia 01: " +precedencia01);
		
		// para somar primeiro é so colocar 1 + 1 entre parenteses:
		
		int precedencia02 = (1 + 1) * 5;
		// primeiro vai fazer a soma 1 + 1 , depois o resultado 2
		//vai ser multiplicado * 5 dando 10.
		System.out.println("Precedencia 02: " +precedencia02);
		
		int precedencia03 =   5 * (1 + 1);
		// mesmo estando com a multiplicacao por primeiro,
		//o que vai ser executando por primeiro é a soma entre parenteses.
		System.out.println("Precedencia 03: " +precedencia03);
		
		 
		int precedencia04 = 5 * (1 + 1) + 2;
		// 2 * 5: 10 + 2: 12
		System.out.println("Precedencia 04: " +precedencia04);
		
		int precedencia05 = 5 * ((1 + 1) + 2);
		// caso eu queira : 1 + 1: 2, 2 + 2: 4, 4 * 5;
		System.out.println("Precedencia 05: " +precedencia05);
		
		int cinco = 5;
		int um = 1;
		int precedenciaComVariaveis = cinco * (um + um) ;
		// caso eu queira : 1 + 1: 2, 2 + 2: 4, 4 * 5;
		System.out.println("precedencia Com Variaveis: " +precedenciaComVariaveis);
		
	}

}
