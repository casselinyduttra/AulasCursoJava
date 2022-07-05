/* 
1- Faça um programa para calcular o estoque medio duma peca, sendo que:
a. stock_medio = (quantidade_minima + quantidade_maxima) /2

*/
package Exercicios;

import java.util.Scanner;

public class Exercio01 {
     public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        
          System.out.println(" Coloque a quantidade do Estoque Maximo: ");
          double quantidade_maxima = scan.nextDouble();
          
          System.out.println(" Coloque a Quantidade do Estoque Minimo: ");
          double quantidadeMinima = scan.nextDouble();
  
          double stock_medio = (quantidadeMinima + quantidade_maxima) /2;
          System.out.println(" o stock medio é: " + stock_medio );
          
 
    }
}
    
