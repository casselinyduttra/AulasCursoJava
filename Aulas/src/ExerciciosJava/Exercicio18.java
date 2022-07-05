/*
 * 18. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
o valor seja inválido e continua a pedir até que o utilizador informe um valor válido.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio18 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota;
            do{
            System.out.print("Digite com uma nota: ");
             nota = scan.nextDouble();
            
            if(nota < 0 || nota > 10){
                System.out.println("Valor Invalido!");               
            }
            
        }    while(nota < 0 || nota > 10);
        System.out.println("Valor Valido!");
    }
}
