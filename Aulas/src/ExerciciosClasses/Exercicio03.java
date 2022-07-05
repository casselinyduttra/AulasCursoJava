/*
3. Usando o resultado do exercício anterior como base, crie uma classe “LivroDeLivraria”
que represente os dados básicos de um livro que está à venda em uma livraria.
*/
package ExerciciosClasses;

public class Exercicio03 {
    public static void main(String[]args){
        
        LivroDeLivraria livro = new LivroDeLivraria();
     
        livro.nomeLivro = "For all my tomorrows";
        livro.idioma = "Ingles";
        livro.qtdPaginas = 268;
        livro.tamanhoArquivo = 2915;
        livro.tipoDeLivro = "Digital";
        livro.valorLivro = 25.50;
        
    }
}
