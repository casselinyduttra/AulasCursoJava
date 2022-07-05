/*
 34. Um funcionário de uma empresa recebe um aumento salarial anualmente: Sabe-se
que:
a. Esse funcionário foi contratado em 1995, com salário inicial de 1.000,00€;
b. Em 1996 recebeu um aumento de 1,5% sobre seu salário inicial;
c. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao
dobro do percentual do ano anterior. Faça um programa que determine o
salário atual desse funcionário. Após concluir isto, altere o programa
permitindo que o utilizador coloque o salário inicial do funcionário
 */
package ExerciciosJava;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio34 {
     public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
        
        double salario = 1000;
        double percentagem = 1.5;
        
        salario += (salario / 100) * percentagem;
        
        //FORMATANDO O VALOR PARA O # EXPECIFICADO
         DecimalFormat format = new DecimalFormat("###,###.##");
         
         for(int i = 1997; i <= 2022; i++){
             percentagem *= 2;
             salario += (salario / 100) * percentagem;
             System.out.println(i + " = " + format.format(salario) + " - " + percentagem + " % ");
        }
         
        // o usuario coloca o seu ordenado:
        /*
        System.out.println("Coloca o valor do salario)");
        salario = scan.nextDouble();
        
        double salario;
        double percentagem = 1.5;
        
        salario += (salario / 100) * percentagem;
        
        //FORMATANDO O VALOR PARA O # EXPECIFICADO
         DecimalFormat format = new DecimalFormat("###,###.##");
         
         for(int i = 1997; i <= 2022; i++){
             percentagem *= 2;
             salario += (salario / 100) * percentagem;
             System.out.println(i + " = " + format.format(salario) + " - " + percentagem + " % ");
        }
        */
     }    
}
     
