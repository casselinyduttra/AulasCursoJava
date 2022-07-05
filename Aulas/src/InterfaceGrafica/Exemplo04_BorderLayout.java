
package InterfaceGrafica;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;



public class Exemplo04_BorderLayout extends JFrame {
           
       JButton botao1 = new JButton ("Test1");
       JButton botao2 = new JButton ("Test2");
       JButton botao3 = new JButton ("Test3");
       JButton botao4 = new JButton ("Test4");
       JButton botao5 = new JButton ("Test5");
       
       
        public Exemplo04_BorderLayout(){  
      
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, botao1);
        add(BorderLayout.EAST, botao2);
        add(BorderLayout.SOUTH, botao3);
        add(BorderLayout.WEST, botao4);
        add(BorderLayout.CENTER, botao5);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo04_BorderLayout();
        
    }
}

