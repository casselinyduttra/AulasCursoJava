/*
 *30. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
quantidade de turmas e a quantidade de alunos para cada turma. As turmas não
podem ter mais de 40 alunos.
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Digite a quantidade de turmas: ");
            double turmas = scan.nextDouble();
        
        int numAlunos, soma=0;
        boolean invalido = true;
        
        for (int i=1; i <= turmas; i++){ 
            invalido = true;
            
            do {
                System.out.println(" Digite a quantidade de alunos para cada turmas: ");
                numAlunos = scan.nextInt();
                
                if (numAlunos <= 40){
                    invalido = false;
                }
                else {
                   System.out.println(" [Uma turma só pode ter 40 alunos] digite novamente: "); 
                }
            } while (invalido);
            
            soma += numAlunos;
        }
        double media = soma / turmas;
        
        System.out.println(" Media:" + media);
    }           
}

