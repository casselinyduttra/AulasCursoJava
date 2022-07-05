/*
 * 05. Escreva uma classe para representar um Aluno. Adicione atributos relacionados às
características do Aluno, como nome, matrícula, curso que está matriculado, nome de
3 disciplinas que está a frequentar e as notas dessas 3 disciplinas. Desenvolva um
método para verificar se o aluno está aprovado (nota maior ou igual a 10) numa
determinada disciplina. Escreva um programa para testar essa classe, que pede as
informações do aluno ao utilizador e ao final informa o nome das disciplinas, mostra as
notas e mostra se o aluno foi aprovado ou não.
 */
package ExerciciosClasses;
import java.util.Scanner;
public class Exercicio05Aluno {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
         
        System.out.println("Entre com o nome do Aluno ");
        aluno.nomeAluno = scan.next();
        
        System.out.println("Entre com o nome do Curso ");
        aluno.cursoMatriculado = scan.next();
        
        System.out.println("Entre com a Matricula ");
        aluno.numMatricula = scan.nextInt();
        
        //aluno.nomeDisciplinas = new String [3];
        for (int i=0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da Disciplina " +i);
            aluno.nomeDisciplinas[i] = scan.next();
        }
   
        for (int i=0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo nota da Disciplina " +aluno.nomeDisciplinas[i]);
            for(int j=0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostarInformacoes();
        
        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
           if (aluno.verificarAprovacao(i)){
               System.out.println("Disciplina " +aluno.nomeDisciplinas[i] + "- foi Aprovado");
           }else {
               System.out.println("Disciplina " +aluno.nomeDisciplinas[i] + "- foi Reprovado");
           }
        }
    }
    
}
