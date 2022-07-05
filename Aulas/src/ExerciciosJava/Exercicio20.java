/*
 *  20. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio20 {
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
      
    boolean infoValida = false;
    String nome, sexo, estadoCivil;
    int idade;
    double salario;
    
    do{
        System.out.println("Qual seu nome: ");
        nome = scan.nextLine();
            if (nome.length() >= 3){
                // saber a quantidade de caracteres numa string.
                 infoValida = true;   
                }
                else {
                     System.out.println("Nome precisa ser no <minimo 3 caracteres>: ");
                     }
    }while (!infoValida);
    
    
    infoValida = false;
    
    do{
        System.out.println("Sua idade: ");
        idade = scan.nextInt();
            if (idade >= 0 && idade <= 150){       
                 infoValida = true;   
            }
                else {
                    System.out.println(" Idade precisa ser entre 0 e 150. ");
                }
    }while (!infoValida);
    
    infoValida = true;
    do{
        System.out.println("Digite o salario: ");
        salario = scan.nextDouble();
            if (salario > 0){       
                 infoValida = true;   
            }
                else {
                    System.out.println(" Salario precisa ser maior que 0. ");
                }
    }while (!infoValida);
    
    infoValida = true;
    do{
        System.out.println(" Digite o sexo: ");
        sexo = scan.next();
            if (sexo.equalsIgnoreCase("f") ||  
                    sexo.equalsIgnoreCase("m")){       
                infoValida = true;   
            }
                 else {
                    System.out.println(" Sexo precisa ser F ou M ");
                }
    }while (!infoValida);
    
    infoValida = true;
    do{
        System.out.println(" Digite o estado civil: ");
        estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") ||  
                    estadoCivil.equalsIgnoreCase("c")||  
                    estadoCivil.equalsIgnoreCase("v")||  
                    estadoCivil.equalsIgnoreCase("d")){       
                infoValida = true;   
            }
                 else {
                    System.out.println(" Estado Civil precisa ser 's', 'c', 'v', 'd' ");
                }
    }while (!infoValida);
    
    System.out.println("As seguintes informacoes foram coletadas: ");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salario: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estaco Civil: " + estadoCivil);
    
    }
}
