/*
 * 68. Modifique o programa anterior de maneira a guardar os compromissos de todo o ano,
organizados por mês, dia e hora (só 8 horas por dia).
*/
package ExerciciosJava.ExercicioVetorEMatriz;
import java.util.Scanner;
public class Exercicio20 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String[][][] compromissos = new String [12][31][24];
         
        boolean sair = false;
        byte opcao; 
     
        while (!sair){
            System.out.println(" Coloca 1 para adicionar compromissos: ");
            System.out.println(" Coloca 2 para verificar compromissos: ");
            System.out.println(" Coloca 0 para sair. ");
            opcao = scan.nextByte();
            
            
            if ( opcao == 1){
                boolean mesValido = false;
                int mes = 0;
                
                while(!mesValido){
                   System.out.println("Coloca o Mes do ano"); 
                   mes = scan.nextInt();
                   if (mes > 0 && mes <= 12){
                       mesValido = true;
                   } else {
                       System.out.println("Mes Invalido, coloque novamente");
                   }
                }         
                
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
                    if (hora > 0 && hora <= 8){
                        horaValido = true;
                    }else {
                        System.out.println("Hora Invalida, coloque novamente");
                    }
                }
                mes --;
                dia--;
                System.out.println("Coloca o compromisso");
                compromissos[mes][dia][hora] = scan.next();
                               
            } else if (opcao == 2){
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Coloca o mes do ano");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12 ){
                        mesValido = true;
                    }else {
                         System.out.println("Mes Invalida, coloque novamente");
                    }
                }
                
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
                    if (hora >0 && hora <= 8){
                        horaValida = true;
                    } else {
                        System.out.println("Hora Invalido, coloque novamente");
                    }
                }
                
                mes-- ;
                dia --;
                System.out.println("Compromisso Agendado é: ");
                System.out.println(compromissos [mes][dia][hora]);                
                
           } else if (opcao == 0){
                sair = true;
            }else {
                System.out.println("Opcao Invalida, coloca novamente uma opcao");
            }
            
        }
        
     }    
}
