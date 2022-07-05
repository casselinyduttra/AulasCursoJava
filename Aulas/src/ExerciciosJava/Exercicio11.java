/*
 * 11. Faça um Programa que peça os 3 lados de um triangulo. O programa devera informar
se os valores poder ser um triangulo. Indique, caso os lados formem um triangulo, se o
mesmo é: equilátero, isósceles ou escaleno.
a. Triangulo equilátero – três lados iguais;
b. Triangulo isósceles – dois lados iguais;
c. Triangulo escaleno – três lados diferentes;

 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio11 {
     public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduza o primeiro lado: ");
        float lado1 = scan.nextFloat();
        System.out.println("Introduza o segundo lado: ");
        float lado2 = scan.nextFloat();
        System.out.println("Introduza o terceiro lado: ");
        float lado3 = scan.nextFloat();
        
      
        if (lado1 == lado2 && lado1 == lado3){
                System.out.println(" é um Triangulo equilátero ");
                }
        else if (lado1 == lado2 && lado1 == lado3 && lado2 != lado3){
            System.out.println(" é um Triangulo isósceles ");
        }
        else  {
            System.out.println("é um Triangulo escaleno");
            
        }
        
    }
}
