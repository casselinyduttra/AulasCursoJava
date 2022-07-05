/* 

A fórmula para o seu cálculo eu vou passar aqui pra você e sua missão é criar um pequeno programa que 
faça esse cálculo automaticamente. Veja aqui a fórmula:

IMC = PESO / (ALTURA * ALTURA)
Lembrando que o peso é em quilogramas e a altura é em metros.

A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a 
altura, respectivamente. Esses dois valores serão informados pelo usuário - 
da mesma forma como fizemos na aula anterior.

Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai 
guardar o resultado da multiplicação da altura por ela mesma 
(é a parte "ALTURA * ALTURA" da fórmula acima).

Agora basta dividir o peso pela multiplicação que foi feita. 
O resultado dessa divisão já será o final. 
Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.

*/
package Exercicios;

import java.util.Scanner;

public class exercicioCurso01 {
    
    public static void  main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o seu PESO: ");
         double peso = scan.nextDouble();
        
        System.out.println("Informe a sua ALTURA: ");
         double altura = scan.nextDouble();
        
        double IMC = peso /(altura * altura);
                      
        System.out.println("O IMC da pessoa é " + IMC);
    }
}
