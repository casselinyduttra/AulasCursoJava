
package Exemplos;

public class Exempo13_Metodos {
     public static void main(String[] args){
         
         //metodo de chamar a funcao:
         
        Pessoa eu = new Pessoa();
         
        eu.durmir();
         
         //chamar as classes, mas temos que passar os parametros la dentro:
        
        String apresentacao = eu.apresentar();
        System.out.println(apresentacao);
        
        eu.mostrarNome("Dias");
        
        int idade = eu.calcularIdade(1991, 2022);
        System.out.println(idade);
     }
}
