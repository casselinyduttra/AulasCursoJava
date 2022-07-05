
package Exemplos;

public class Exempo10_Foreach {
    public static void main(String[] args){
        String [] nomes1 = {"Tiago", "Tania","Ana"};
        for(String nome : nomes1){
            System.out.println(nome);           
        }
        int[] numeros = {1,5,10};
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        System.out.println(soma);
    }
}
