/*
 * 8. Faça um Programa que pergunte o preço de três produtos e informe qual o produto
deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Qual o valor do Tshirt?: ");
        double tshirt = scan.nextDouble();
        
         System.out.println(" Qual o valor do Moleton?: ");
        double moleton = scan.nextDouble();
        
         System.out.println(" Qual o valor do Sapato?: ");
        double sapato = scan.nextDouble();
        
        
       if (tshirt < moleton && tshirt < sapato){
           System.out.println("Voce vai comprar o produto Tshirt que custa: " + tshirt + " € ");     
       }
       else if (moleton < tshirt && moleton < sapato){
           System.out.println("Voce vau comprar o produto Moleton, que custa : " + moleton + " € " );
       }
       else if (sapato < tshirt && sapato < moleton){
           System.out.println("Voce vau comprar o produto Sapato, que custa: " + sapato + " € ");
       }
    }
}
