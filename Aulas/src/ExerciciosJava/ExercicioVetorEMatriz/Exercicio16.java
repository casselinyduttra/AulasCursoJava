/*
 * 64. Gerar e imprimir uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso
determine o maior número da matriz e a sua posição (linha, coluna).
 */
package ExerciciosJava.ExercicioVetorEMatriz;
import java.util.Random;
public class Exercicio16 {
    public static void main(String[] args){
        
        int [][] num = new int [4][4];
        
        Random numAleatorios = new Random();
        
        for(int i = 0; i < num.length; i++){
            for ( int j =0; j < num[i].length; j++ ){
                num[i][j] = numAleatorios.nextInt(10); 
            }
        }
        
        int maior=0;
        int linha=0;
        int coluna=0;
        
        for(int i = 0; i < num.length; i++){
            for ( int j =0; j < num[i].length; j++ ){
                if (num[i][j] > maior){
                    maior = num[i][j];
                    linha = i;
                    coluna = j;
                } 
            }
        }
        
        for(int i = 0; i < num.length; i++){
            for ( int j =0; j < num[i].length; j++ ){
                System.out.print(num[i][j] + " ");
            } 
            System.out.println();
         }
        System.out.println();
        System.out.println("Maior Valor: " + maior);
        System.out.println("Menor Valor: " + linha);
        System.out.println("Coluna: " +coluna);
        
    }
}
