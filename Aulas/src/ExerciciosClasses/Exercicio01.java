
package ExerciciosClasses;

public class Exercicio01 {
    public static void main(String[]args){
        
        Lampada lampada = new Lampada();
        
        lampada.modelo = "Decoração";
        lampada.potencia = 7;
        lampada.cor = "Branco";
        lampada.garantiaProduto = 5;
        lampada.tecnologia = "LED";
        
        System.out.println("Modelo: " +lampada.modelo);
        System.out.println("Potencia: " +lampada.potencia);
        System.out.println("Cor: " +lampada.cor);
        System.out.println("Garantia Produto: " +lampada.garantiaProduto);
        System.out.println("Tecnologia: " +lampada.tecnologia);
    }
}
