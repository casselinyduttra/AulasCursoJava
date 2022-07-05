
package Exemplos;

public class Exempo11_Matriz {
    public static void main(String[] args){
        String[][] nomes = new String[3][4];
        
        nomes[0][0] = "Miguel";
        System.out.println(nomes[0][0]);
        
        // outra forma de fazer:
        
        String [][] nomes1 = {{"tiago", "tania", "ana"},{"miguel", "isabel","sofia"}};
        
        System.out.println(nomes1[1][2]);
    }
}
