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

public class Aluno {
    
    String nomeAluno;        
    int numMatricula ;
    String cursoMatriculado;
    String[] nomeDisciplinas = new String [3];           
    double[][] notasDisciplinas = new double [3][3];     
    
    //esse metodo nao me vai retornar valores, so vai mostrar no ecra:
    void mostarInformacoes(){
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Matricula: " + numMatricula);
        System.out.println("Curso Matriculado: " + cursoMatriculado);
        
        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    boolean verificarAprovacao(int indice){
        double soma =0;
        for (int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        
        double media = soma / 3;
        
        if (media >= 10){
            return true;
        }
           return false;   
    }
    
    
}
