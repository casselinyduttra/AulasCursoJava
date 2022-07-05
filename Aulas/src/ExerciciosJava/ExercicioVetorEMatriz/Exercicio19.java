/*
 * 67. Faça um programa para armazenar numa matriz os compromissos de uma agenda
pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas
podemos associar uma tarefa específica (compromisso agendado). O programa deve
ter um menu onde o utilizador indique o dia do mês que deseja alterar e a hora,
colocando em seguida o compromisso, ou então, o utilizador pode também consultar a
agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
 */
package ExerciciosJava.ExercicioVetorEMatriz;

import java.util.Scanner;
public class Exercicio19 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String[][] compromissos = new String[31][24];
        boolean sair = false;
        byte opcao; 
     
        while (!sair){
            System.out.println(" Coloca 1 para adicionar compromissos: ");
            System.out.println(" Coloca 2 para verificar compromissos: ");
            System.out.println(" Coloca 0 para sair. ");
            opcao = scan.nextByte();
            
            if ( opcao == 1){
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                   System.out.println("Coloca o dia do mês");
                   dia = scan.nextInt();
                   if(dia > 0 && dia <= 31){
                       diaValido = true;
                   } else {
                       System.out.println("Dia Invalida, coloca novamente");
                   }
                }
                boolean horaValido = false;
                int hora = 0;
                
                while (!horaValido){
                    System.out.println("Coloca a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValido = true;
                    }else {
                        System.out.println("Hora Invalida, coloque novamente");
                    }
                }
                
                dia--;
                System.out.println("Coloca o compromisso");
                compromissos[dia][hora] = scan.next();
                               
            } else if (opcao == 2){
                boolean diaValido = false;
                int dia = 0;
                
                while(!diaValido){
                    System.out.println("Coloca o dia do mes");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia Invalido, coloque novamente");
                    }
                    
                }
                
                boolean horaValida = false;
                int hora = 0;
                
                while (!horaValida){
                    System.out.println("Coloca Hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora Invalido, coloque novamente");
                    }
                }
                
                dia --;
                System.out.println("Compromisso Agendado é: ");
                System.out.println(compromissos [dia][hora]);
                                
           } else if (opcao == 0){
                sair = true;
            }else {
                System.out.println("Opcao Invalida, coloca novamente uma opcao");
            }       
        }      
     }    
}
