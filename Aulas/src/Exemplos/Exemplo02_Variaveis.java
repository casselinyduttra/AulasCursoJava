
package Exemplos;
 public class Exemplo02_Variaveis {
	public static void main(String[]args){
		//VARIAVEIS
		// Numero Inteiro
		byte a = 127; // Inteiro e 8 bits. Pode assumir valores ente 128 e 127
		short b = 32767; // Inteiro de 16 bits. Pode assumir valores entre -32768  e 32767
		int c= 2147483647; // Inteiro de 32 bits. Pode assumir valores entre -2147483648 e 2147483647
                
		// Numero decimal
		double d = 3.14;
		float e = 3.95f;

		// Carateres
		char f = 'a';
	
		// Boleanas 
		boolean  verdadeiro = true ; // false

		// Strings
		String palavra = "JAVA";
//são um conjunto de chaves, String e um tipo de variável inicial entra no mundo dos vetores por isso e diferente das outras, ela não vai aparecer em azul, e precisa ser escrita em letra maiúscula. Considerada variavel mas funciona de forma diferente.

    System.out.println("O valor da minha variavel a é " + a);
    System.out.println("O valor da minha variavel b é " + b);
    System.out.println("O valor da minha variavel c é " + c);
    System.out.println("O valor da minha variavel d é " + d);
    System.out.println("O valor da minha variavel e é " + e);
    System.out.println("O valor da minha variavel f é " + f);
    System.out.println("O valor da minha variavel palavra é " + palavra);
        }
}
        
        
