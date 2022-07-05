
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean carrinhoMaiorQue100 = false;
		boolean periodoDePromocao = true;
		boolean jaFezCompra = false;
		boolean pagamentoVista = true;
//		boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; 
//		
//		if (aplicarDesconto) {
//			System.out.println("Sim! Aplique o desconto.");
//		}else {
//			System.out.println("Nao aplique o desconto");
			
			
//			boolean aplicarDesconto =  periodoDePromocao && carrinhoMaiorQue100 && jaFezCompra;
//			if (aplicarDesconto) {
//				System.out.println("Sim! Aplique o desconto.");
//			}else {
//				System.out.println("Nao aplique o desconto.");
			
				boolean aplicarDesconto =  periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompra) && pagamentoVista;
				if (aplicarDesconto) {
					System.out.println("Sim! Aplique o desconto.");
				}else {
					System.out.println("Nao aplique o desconto.");
			
			
		}

	}

}

/* OPERADOR &&:       * duas condicoes tem que esta verdadeira, para a condicao ser repondida verdadeira.
 true + true = true
 true + false =  false
 false + true = false
 false + false = false

*OPERADOR ||:         * sempre que tivemos uma verdade( true na expressa) o resultado sera true.
true + true = true
true + false = true
false + true = true
false + false = false

*OPERADOR 



*/

