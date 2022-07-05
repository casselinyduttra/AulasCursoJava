
package Exemplos;

public class Exemplo14_MetodosNParametros {
    
    int somarNumeros(int ... numeros){
        int soma = 0;
        for(int n : numeros){
            soma += n;
        }
        return soma;
    }
     public static void main(String[] args){
         Exemplo14_MetodosNParametros teste = new Exemplo14_MetodosNParametros();
         
         int soma = teste.somarNumeros(10, 500, 70 , 80500);
         System.out.println(soma);
     }
    
}
