// classes JAV.
package Exemplos;

public class Pessoa {
    
    String nome = "Joaquim";
    
    void durmir (){
        System.out.println("ZzZzZzZzZzZ");
    } 
    
    String apresentar(){
        return "Bem vindo, o meu nome é " +nome;
    }
    void mostrarNome(String apelido){
        System.out.println("Apelido é: " +apelido);
    }
    
    int calcularIdade (int nascimento, int anoAtual){
        return anoAtual - nascimento;
    }
    
}
