/*
 * 32. O Departamento de Meteorologia contratou para desenvolver um programa que leia
um conjunto indeterminado de temperaturas. No final tens que informar a menor, a
maior temperaturas e a média das temperaturas.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
    
        System.out.print(" Entre com a quantidade de temperaturas:");
        int qtdTemperaturas = scan.nextInt();
        
        double temp, soma=0;
        double maior= Double.MIN_VALUE, menor = Double.MAX_VALUE;
        
        for (int i=1; i <= qtdTemperaturas; i++){
            
            System.out.print(" Digite a temperatura " +i + ": " );
                temp = scan.nextDouble();
                
            soma = soma + temp;
            
            if (temp > maior){
                maior = temp;
            }
            if (temp < menor){
                menor = temp;
            }
        }
       
        System.out.println(" Media das temperaturas " + (soma /qtdTemperaturas));
        System.out.println(" Maior Temperatura " +maior);
        System.out.println(" Menor Temperatura " +menor);
    
    }    
}
