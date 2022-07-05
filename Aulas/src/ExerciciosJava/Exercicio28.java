/*
 * 28. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números ímpares.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num, par=0, impar=0;
 
        for (int i = 0; i < 10; i++){
            System.out.println("Introduza o valor:");
                num = scan.nextInt();
        
             if (num %2 ==0){
                par++;
            }
            else{
                impar++;
            }
        }     
            System.out.println(" numeros pares: "+ par);
            System.out.println(" numeros impares: "+ impar);
         }
    }

