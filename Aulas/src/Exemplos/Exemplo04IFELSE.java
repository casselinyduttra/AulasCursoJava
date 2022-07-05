
package Exemplos;

public class Exemplo04IFELSE {
   public static void main(String[] args){
       int idade = 16;
       
       if (idade >= 18){
           System.out.print("Podes tirar a carta de carro!! ");
       }
       else if (idade >= 16){
           System.out.print("pode tirar a carta de mota!! ");
       }
       else {
           System.out.print("nao pode tirar a carta!! ");
       }
       boolean temCartadeConducao = true;
       if (idade >= 18 && temCartadeConducao == true){
           System.out.print("pode conduzir!! ");
       }
       else {
           System.out.print("Nao podes conduzir!! ");
       }
   } 
}
