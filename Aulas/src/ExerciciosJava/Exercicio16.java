/*
 * 16. Um posto está a vender combustível com a seguinte tabela de descontos:
a. Diesel
i. Até 20 litros – desconto de 3% por litro OK
ii. Acima de 20 litros – desconto de 5% por litro
b. Gasolina
i. Até 20 litros – desconto de 4% por litro
ii. Acima de 20 litros – desconto de 6% por litro
c. Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (D – Diesel, G – Gasolina), calcule e imprima o valor a ser pago
pelo cliente sabendo que o preço do litro de gasolina é de 2.50€ e o preço do
litro de diesel é de 1.90€.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio16 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        
       double litro, desconto=0, valor=0;
       
        System.out.print(" Digite a quantidade de litros abastecido: ");
        litro = scan.nextDouble();
        
        System.out.println(" Escolha qual combustivel deseja colocar: ");
        System.out.println(" < D para Diesel >  ");
        System.out.println(" < G para Gasolina >  ");    
        String tipoCombustivel = scan.next();
        
      
        switch (tipoCombustivel){
            case "D" :
            if (litro <= 20) {
            valor = litro * 1.90; 
            desconto = (valor * 3) /100;
            System.out.println(" o valor a ser pago é " +(valor - desconto));
        }
            else {
                valor = litro * 1.90;
                desconto = (valor * 5) /100;
                System.out.println(" o valor a ser pago é " +(valor - desconto));
            }
            break;
            case "G":
                if ( litro <= 20 ){
                    valor = litro * 2.50;
                    desconto = (valor * 4) /100;
                    System.out.println(" o valor a ser pago é " +(valor - desconto));
                }
                else {
                    valor = litro * 2.50;
                    desconto = (valor * 6) /100;
                    System.out.println(" o Valor Final a ser pago é " +(valor - desconto));
                }
        }
        
        System.out.println(" O tipo de Combustivel Abastecido foi " +tipoCombustivel);
       
        
    }
}
