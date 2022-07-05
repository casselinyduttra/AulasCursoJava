
package Exemplos;


public class Exemplo08_Vetores {
    public static void main(String[]args){
        
        String[] nomes = new String[3];
        
        nomes[0] = "Joaquim";
        nomes[1] = "Joaquina";
        nomes[2] = "Francisco";
        
        System.out.println(nomes[2]);
        
        //outra forma possivel de guardar dados nos vetores:
        
        String[] nomes1 = {"Tiago", "Tania", "Ana"};
        System.out.println(nomes1[2]);
    }
}
