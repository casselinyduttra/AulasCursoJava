/*
 * 69. Faça um programa para jogar os 3 em linha. O programa deve permitir que dois
jogadores façam uma partida do 3 em linha, usando o computador para ver o
tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar
a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar
automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou
jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na
tela.
 */
package ExerciciosJava.ExercicioVetorEMatriz;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        char [][] jogo = new char [3][3];
        
        System.out.println(" Jogador 1 = x");
        System.out.println(" Jogador 2 = O");
        
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;
        
        while(!ganhou){
            if (jogada %2 == 1){
               System.out.println(" Vez Jogador 1. Escolhe a linda e a coluna");
               sinal = 'X';
            } else {
               System.out.println(" Vez Jogador 2. Escolhe a linda e a coluna");
               sinal = 'O';
            }
            
            boolean linhaValida = false;
            while (!linhaValida){
               System.out.println(" Coloca uma linha (1 , 2 ou 3) ");
               linha = scan.nextInt();
               
               if (linha >= 1 && linha <= 3){
                   linhaValida = true;
               } else {
                   System.out.println(" Linha invalida, tente novamente");
               }
            }
            
            boolean colunaValida = false;
            
            while(!colunaValida){
                System.out.println(" Coloca uma coluna (1 , 2 ou 3) ");
                coluna = scan.nextInt();
                
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                } else {
                    System.out.println(" Coluna invalida, tente novamente");
                }
            }
            
            linha--;
            coluna--;
            
            if (jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O'){
                System.out.println(" Posicao ja usada, tente novamente. ");
            } else {
                jogo[linha][coluna] = sinal;
                jogada ++;
            }
            
            //imprimir jogo
            for (int i = 0; i < jogo.length; i++){
                for (int j = 0; j < jogo.length; j ++){
                    System.out.print(jogo[i][j] + " | ");
                }
                System.out.println();
            }     
            
            //verificar quem ganha
            
            if ((jogo[0][0] == 'X' && jogo [0][1] == 'X' && jogo [0][2] == 'X') || 
               (jogo[1][0] == 'X' && jogo [1][1] == 'X' && jogo [1][2] == 'X') ||
               (jogo[2][0] == 'X' && jogo [2][1] == 'X' && jogo [2][2] == 'X') ||
               (jogo[0][0] == 'X' && jogo [1][0] == 'X' && jogo [2][0] == 'X') ||
               (jogo[0][1] == 'X' && jogo [1][1] == 'X' && jogo [2][1] == 'X') ||
               (jogo[0][2] == 'X' && jogo [1][2] == 'X' && jogo [2][2] == 'X') ||
               (jogo[0][0] == 'X' && jogo [1][1] == 'X' && jogo [2][2] == 'X') ||
               (jogo[0][2] == 'X' && jogo [1][1] == 'X' && jogo [2][0] == 'X')){
                    ganhou = true;
                    System.out.println("Parabens, o jogador 1 ganhou ");
            } else if ((jogo[0][0] == 'O' && jogo [0][1] == 'O' && jogo [0][2] == 'O') || 
               (jogo[1][0] == 'O' && jogo [1][1] == 'O' && jogo [1][2] == 'O') ||
               (jogo[2][0] == 'O' && jogo [2][1] == 'O' && jogo [2][2] == 'O') ||
               (jogo[0][0] == 'O' && jogo [1][0] == 'O' && jogo [2][0] == 'O') ||
               (jogo[0][1] == 'O' && jogo [1][1] == 'O' && jogo [2][1] == 'O') ||
               (jogo[0][2] == 'O' && jogo [1][2] == 'O' && jogo [2][2] == 'O') ||
               (jogo[0][0] == 'O' && jogo [1][1] == 'O' && jogo [2][2] == 'O') ||
               (jogo[0][2] == 'O' && jogo [1][1] == 'O' && jogo [2][0] == 'O')){
                    ganhou = true;
                    System.out.println("Parabens, o jogador 2 ganhou ");
                } else if (jogada > 9 ){
                    ganhou = true;
                    System.out.println("Ninguem ganhou");
                }          
        }
     }    
}
