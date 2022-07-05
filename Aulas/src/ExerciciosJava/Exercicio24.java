/*
 * 24. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
 */
package ExerciciosJava;

public class Exercicio24 {
    public static void main(String[] args) {
        
        
        System.out.println("Numero Impares entre 1 a 50: ");
        
        for( int i= 0; i < 50; i++){
            if ( i% 2 != 0){
                System.out.println(i);
            }
        }
    }   
}
