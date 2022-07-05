/*
 *29. Faça um programa que peça a idade de n pessoas, no final o programa deve verificar
se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60. Então tem
que dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        double soma=0;
        
        System.out.print(" Quantas pessoas vao colocar a idade ");
            double idades = scan.nextDouble();
        
        for (int i=0; i <idades; i++){
            System.out.print(" Entre com a idade da " + i + " Pessoa " );
                double idade = scan.nextDouble(); 
            
            soma = soma + idade;
        }
        
        double media = soma / idades;
            System.out.print(" A media de idade: " +media);
        
        if (media >=0 && media <=25){
           System.out.println(" **JOVEM**"); 
        }
        else if ( media >=26 && media <=60){
            System.out.println(" **ADULTA**");
        }
        else if ( media > 60){
            System.out.println(" **IDOSA**");
        }     
    }
}
