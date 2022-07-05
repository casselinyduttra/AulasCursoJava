/*

*/
package Exemplos;

public class Exempo12_Classes {
    public static void main(String[] args){
        
        Pessoa eu = new Pessoa ();
       // System.out.println(eu.nome);
       
       //formas para chamar as variaveis globais em outros documentos:
       //variavel foi declarada na Classe Pessoa,
       //entao ela esta lendo essa variavel aqui:
       
       eu.nome = "Manuel";      
       System.out.println(eu.nome);
        
    }
}
