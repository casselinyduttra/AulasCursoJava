/*
 * 10. Uma Organização resolveu dar um aumento de salários aos empregados.
a. Faça um programa que receba o salário dum empregado e o reajusto segundo
o seguinte critério:
i. Salários até 280€ - aumento de 20%; OK
ii. Salário entre 280€ e 700€ - aumento de 15%;
iii. Salário entre 700€ e 1500€ - aumento de 10%; OK
iv. Salário superior a 1500€ - aumento de 5%
v. Após o aumento ser realizado, informe no ecrã:
1. Salário antes do aumento;
2. A percentagem do aumento aplicado;
3. O valor do aumento;
4. Salário com o aumento;
 */
package ExerciciosJava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduza o ordenado do funcionario Lucas: ");
        double salario = scan.nextDouble();
        
        double  salarioNovo=0, valorAumento=0;
        int percentual=0;
        
        percentual = percentual / 100; 
         
        if (salario <= 280){
            percentual = 20;
        }
        else if (salario > 280 && salario < 700){
            percentual = 15;
        }
        else if ( salario >= 700 && salario < 1500 ){
            percentual = 10;
        }
        else if ( salario >= 1500){
           percentual = 5;
        }
        
         valorAumento = ( salario/100 ) * percentual ;
         salarioNovo = salario + valorAumento;
                 
        System.out.println(" O Salário antes do aumento era de " + salario + " € ");
        System.out.println(" A percentagem do aumento aplicado foi de " + percentual + " € ");
        System.out.println(" O valor do aumento foi de " + valorAumento + " € ");
        System.out.println(" O Salário com o aumento foi de " + salarioNovo + " € ");
    }
}
