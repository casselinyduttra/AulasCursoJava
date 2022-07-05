/*
 * 33. Desenvolva um programa que faça a tabuada de um número qualquer inteiro colocado
pelo utilizador, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
10, o valor inicial e final devem ser informados também pelo utilizador.
a. Deves verificar se o utilizador não digitou o final menor que o inicial
 */
package ExerciciosJava;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero que voce deseja fazer a tabuada: ");
            int num = scan.nextInt();
            
        boolean invalido = true;
        int numInicio, numFinal;   
            
        do{
            
        System.out.print("Digite o inicio da tabuada: ");
        numInicio = scan.nextInt();
        
        System.out.print("Digite o final da tabuada: ");
        numFinal = scan.nextInt();
        
         if ( numFinal > numInicio){
             invalido = false;
        }
        }while (invalido);
    
        System.out.println(" *** Tabuada do numero " + num);
        System.out.println(" *** Comeca no numero: " + numInicio  );
        System.out.println(" *** Termina no numero: "+ numFinal );
        System.out.println();
        
        for (int i=numInicio; i <=numFinal; i++ ){
            System.out.println(+ num + " x " + i + " = " + num*i);
            
        }
    }
}
