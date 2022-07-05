/*
 *17. Uma loja está a vender frutas com a seguinte tabela de preços:
a. Se o cliente comprar mais de 8Kg em frutas ou valor total da compra
ultrapassar 25€, receberá ainda um desconto de 10% sobre este total. 
Escreva um programa para ler a quantidade (em Kg) de morangos e a quantidade (em
Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
Produto Até 5 Kg Acima de 5 Kg
Morangos 2.50€/Kg 2.20€/Kg
Maçã 1.80€/Kg 1.50€/Kg
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double qtdMaca, qtdMorango;
            
        System.out.print(" Digite a quantidade de kilos da Maça: ");
        qtdMaca = scan.nextDouble();
        
        System.out.print(" Digite a quantidade de kilos do Morango: ");
        qtdMorango = scan.nextDouble();
       
        
       double precoKgMorango = 0;
                          
        if (qtdMorango <= 5){
            precoKgMorango = 2.50;        
        }
        else {
            precoKgMorango = 2.20;
        }
        
        double precoKgMaca = 0;
        if (qtdMaca <= 5){           
            precoKgMaca = 1.80;
        }  
        else {
            precoKgMaca = 1.50;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;
        
        
        if (qtdMorango + qtdMaca > 8 || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);           
        }
        System.out.println(" O valor da compra é: " + precoTotal + " € ");
        System.out.println(" O total em KG de Maça é " + qtdMaca + " Kg e de Morango é " + qtdMorango + " Kg. ");
        System.out.println(" Parabens, comprando aqui na loja de frutas você economizou " + precoParcial + " € ");
     
    }
}
