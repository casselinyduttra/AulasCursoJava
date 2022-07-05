/*
 *  12. Faça um programa que calcule as raízes de uma equação de segundo grau, na forma
ax2 + bx + c. O programa deverá pedir os valores de a, b, c e fazer as consistências,
informando ao utilizador nas seguintes situações:
a. Se o utilizador informar o valor A igual a zero, a equação não é do segundo
grau e o programa não deve pedir os outros valores, sendo encerrado;
b. Se o resultado for negativo, a equação não possui raízes reais. Informe ao
utilizador e encerra o programa;
c. Se o resultado for igual a zero a equação possui apenas uma raiz real; informar
o utilizador.
d. Se o resultado for positivo, a equação possui duas raízes reais; informar o
utilizador.
 */
package ExerciciosJava;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        float a, b, c,      //coeficientes
              delta,        //delta
              sqrtdelta,    //raiz quadrada de delta
              raiz1,raiz2;  //raízes
        
        //Passo 1: Recebendo os coeficientes
        
        System.out.println(" Equação do 2o grau: ax2 + bx + cx = 0 ");
        System.out.print(" Entre com o valor de a: ");
        a = scan.nextFloat();
        System.out.print(" Entre com o valor de b: ");
        b = scan.nextFloat();
        System.out.print(" Entre com o valor de c: ");
        c = scan.nextFloat();
        
        //Passo 2: Checando se a equação é válida
        if(a != 0){
        
        //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
            delta = (b*b) - (4*a*c);
            sqrtdelta = (float)Math.sqrt(delta);
        
        //Passo 4: se a raiz de delta for maior que 0, as raízes são reais    
            if(delta >=0){
                raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            }
        //Passo 5: se delta for menor que 0, as raízes serão complexas
            else{
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
            }           
        }
        else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }
}
