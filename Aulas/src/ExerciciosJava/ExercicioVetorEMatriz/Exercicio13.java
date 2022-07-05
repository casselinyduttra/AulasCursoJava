/*
 *  61. Ler as duas notas para um conjunto de 10 alunos. 
Armazenar as notas informadas em
dois vetores “Nota1” e “Nota2” do tipo real. 
Escreva um programa que calcule a média das notas informadas armazenando 
o resultado em um vetor “Resultados” de mesmo
tipo e tamanho. Ao mostrar os resultados exiba a situação de cada aluno. 
Se a média calculada for superior ou igual a 10 o aluno estará “aprovado”, 
caso contrário, a situação do aluno será “reprovado”.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;

public class Exercicio13 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double[] nota1 = new double[10];
        double[] nota2 = new double[nota1.length];
        double[] resultados = new double[nota1.length];
        
        for (int i=0; i<nota1.length; i++){
            System.out.println("Entre com a nota 1 do aluno " + ( i+1 )+ ": ");
            nota1[i] = scan.nextDouble();
            
            System.out.println("Entre com a nota 2 do aluno " + ( i+1 )+ ": ");
            nota2[i] = scan.nextDouble();
            
            resultados[i] = (nota1[i] + nota2[i]) /2;
        }
        
        System.out.print(" Nota 1: ");
        for (int i=0; i<nota1.length; i++){
            System.out.print(nota1[i] + " ");           
        }
        System.out.println();
        
        System.out.print(" Nota 2: ");
        for (int i=0; i<nota2.length; i++){
            System.out.print(nota2[i] + " ");
        } 
       
        System.out.println();
        
        System.out.println(" Resultado:");
        for (int i=0; i<resultados.length; i++){
            if(resultados[i] >=10){
                System.out.println(resultados[i] + "O aluno foi Aprovado ");
            }else {
                System.out.println(resultados[i] + "O aluno foi Reprovado ");
            }
        }    
    }   
}
