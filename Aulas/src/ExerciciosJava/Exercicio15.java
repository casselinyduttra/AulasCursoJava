/*
 * 15. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
perguntas são:
a. Telefonou para a vítima?
b. Esteve no local do crime?
c. Mora perto da vítima?
d. Devia para a vítima?
e. Já trabalhou com a vítima?
i. O programa deve no final emitir uma classificação sobre a participação
da pessoa no crime. Se a pessoa responder positivamente a 2
questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como
“Cúmplice” e 5 como “Assassino”. Caso contrário, ele será classificado
como “Inocente”.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        
    System.out.print(" Telefonou para a vítima?: "); 
       String resp1 = scan.next();
       
    System.out.print(" Esteve no local do crime?: "); 
       String resp2 = scan.next();
       
    System.out.print(" Mora perto da vítima?: ");
       String resp3 = scan.next(); 
       
    System.out.print(" Devia para a vítima?: ");
       String resp4 = scan.next();
       
    System.out.print(" Já trabalhou com a vítima?: ");
       String resp5 = scan.next();
        
           
    
    int i=0;
    
    if (resp1.equalsIgnoreCase("S")){
        i++;
    }
    if (resp2.equalsIgnoreCase("S")){
        i++;
    }
    if (resp3.equalsIgnoreCase("S")){
        i++;
    }
    if (resp4.equalsIgnoreCase("S")){
        i++;
    }
    if (resp5.equalsIgnoreCase("S")){
        i++;
    }
   
    
        if (i == 2){
            System.out.print(" ** Esta pessoa é Suspeita ** ");
        }
        else if ( i == 3 && i == 4){
            System.out.print(" ** Esta pessoa é Cumplice **");
        }
        else if ( i == 5){
            System.out.print("*** Esta pessoa é o Assassino ***");
        }
        else if (i == 0) {
            System.out.print(" * Esta pessoa é Inocente *");
        }
                  
    }
}
