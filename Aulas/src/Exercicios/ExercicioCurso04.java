/*
 O seu programa deve receber a nota do aluno pelo console e 
depois você vai fazer uma operação lógica para saber se a nota 
do aluno é maior que 70. 
O resultado dessa operação lógica deve ser atribuido a uma 
variável do tipo Boolean.

Por último, você deve utilizar a variável do tipo Boolean 
com a estrutura de decisão if para imprimir, no console, 
uma mensagem que vai dizer se o aluno passou ou não passou.

Volte no exercício 03 desse capítulo e transforme o valor 70 em uma constante.
 */
package Exercicios;

import java.util.Scanner;

public class ExercicioCurso04 {
    public static void main(String [] args){
     Scanner scan = new Scanner (System.in);
        System.out.print(" Introduza a nota do aluno ");
         Integer nota = scan.nextInt();
       
       final Boolean passoudeAno = nota >= 70;
        
      if (passoudeAno){
          System.out.print("*O aluno passou de Ano *");
        }   
      else {
          System.out.println(" --- O aluno nao passou de ano --- ");
      }
    }    
}

        
        

