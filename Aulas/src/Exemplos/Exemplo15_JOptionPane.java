
package Exemplos;
import javax.swing.JOptionPane;
public class Exemplo15_JOptionPane {
    public static void main(String[]args){
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo as Aulas de JAVA");
        
        String leitura = JOptionPane.showInputDialog("Qual é o teu nome: ");
        System.out.println(leitura);
        
        int resposta = JOptionPane.showConfirmDialog(null, "Gostas de programacao?");
        System.out.println(resposta);
    }
}
