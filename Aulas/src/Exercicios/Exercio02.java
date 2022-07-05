/*
2 - Criar um programa que efetue o cálculo da quantidade de litros de combustível gasta numa viagem, utilizando um automóvel
que faz 12km por litro. Para obter o cálculo, o utilizador deve fornecer o tempo gasto na viagem e a velocidade media.
Desta forma, será possível obter a distância percorrida com a seguinte formula:
Distancia = tempo * velocidade. Tendo o valor da distância, basta calcular a quantidade de litros de combustível foi
utilizado na viagem com a seguinte formula: litros_usados = distancia / 12. O programa deve apresentar os valores da
velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizados na viagem.
 */
package Exercicios;

import java.util.Scanner;

public class Exercio02 {
    
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        double autonomia = 12;
          System.out.println(" Indique o tempo gasto na Viagem (HORAS): ");
          double tempo_viagem = scan.nextDouble();
          
          System.out.println(" Indique a velocidade media da Viagem: ");
          double velocidade = scan.nextDouble();
  
          double distancia = tempo_viagem * velocidade;
          double litros_usados = distancia / autonomia;
          
          System.out.println(" A velocidade Media foi de " + velocidade + " Km/h" );
          System.out.println(" O tempo Gasto foi de " + tempo_viagem + " Horas");
          System.out.println(" A distancia percorrida foi de " + distancia + " km ");
          System.out.println(" A quantidade de litros utilizados na viagem foi de " + litros_usados + " litros");
          
    }
}
