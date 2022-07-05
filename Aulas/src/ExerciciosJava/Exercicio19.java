/*
 * 19. Faça um programa que leia um nome de utilizador e a uma senha e não aceite a senha
igual ao nome do utilizador, mostrando uma mensagem de erro e voltar a pedir as
informações.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio19 {
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
        String login , password;
       
System.out.print("Introduza o nome de utilizador: ");
     login = scan.nextLine();

do {
    System.out.print("Introduza a password: ");
    password = scan.nextLine();

        if (login.equalsIgnoreCase(password)){
       // usado para nao diferenciar letras Maiusculas e Minusculas.
            System.out.println(" **Erro** , coloque uma password diferente do seu login!!! ");
        }
    }    
        while (login != password); {
        System.out.print(" Utilizador e password Validas!!! ");
        
    }
        
    }         
}
