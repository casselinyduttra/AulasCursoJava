/*
 Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa 
e depois imprime o nome completo. Para isso, você vai precisar de duas variáveis: 
a primeira você pode chamar de "nome" e a segunda de "sobrenome". Por último, 
você vai juntar o nome e o sobrenome em uma única impressão.
 */
package Exercicios;
    import java.util.Scanner;
        public class ExercicioCurso03 {
            public static void main(String[] agrs){
                Scanner scan = new Scanner (System.in); 
        
        System.out.print("Indique seu Nome: ");
            String nome = scan.nextLine();
        
        System.out.print("Indique seu Sobrenome: ");
            String sobrenome = scan.nextLine();
        
        System.out.print("O seu Nome Completo é: " + nome + sobrenome);
        scan.close();
    }
}
