
package Exercicios;

public class TipoLogicoBoo {
    
 public static void main(String[] args) {
     
	/* Boolean variavelVerdadeira = true;
	System.out.println("Variavel verdadeira: " + variavelVerdadeira);
	
	Boolean variavelFalsa = false;
	System.out.println("Variavel falsa: "+ variavelFalsa);
	*/
	System.out.println("-------------------------------");
	
	Integer idade = 20;
	
	Boolean podeTirarCarta = idade >=18;
        //System.out.println("Pode tirar a carta? " + podeTirarCarta);
        
	 if (podeTirarCarta){
             System.out.println("Sim! Ele (a) pode tirar a carta");
         }
         else {
             System.out.println("Nao! Ele (a) nao pode tirar a carta");
         }
	System.out.println("-------------------------------");
    }
}

