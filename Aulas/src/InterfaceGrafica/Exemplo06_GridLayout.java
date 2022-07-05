
package InterfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class Exemplo06_GridLayout extends JFrame {
    
       
       JButton botao1 = new JButton ("Botão 1");
       JButton botao2 = new JButton ("Botão 2");
       JButton botao3 = new JButton ("Botão 3");
       
    public Exemplo06_GridLayout(){    
        
        
        setLayout(new GridLayout(2,2));
        add(botao3);
        add(botao1);
        add(botao2);
         
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo06_GridLayout();
        
    }
}