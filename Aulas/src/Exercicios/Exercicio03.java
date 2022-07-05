/*
 3- Criar um programa que leia 2 numeros inteiros para a variavel a e b,
efetuar a troca dos valores de modo que a variaval A passe a posuir
o valor de B, e a variavel B passe a possuir o valor de A.
Apresentando os valores trocados

 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
          
            
         System.out.println("Indique um valor para A: ");
         int A = scan.nextInt();
          
         System.out.println(" Indique um Valor para B: ");
         int B = scan.nextInt();
         
         int auxV = A;
          A = B;
          B = auxV;
         
         System.out.println("o Valor de A é: " + A);
         System.out.println("o Valor de B é: " + B);
                  
    }
}
