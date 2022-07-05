
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Exemplo14_ImageIcon extends JFrame {
         
        ImageIcon imagem = new ImageIcon(getClass().getResource("java.JFIF"));
        JLabel label = new JLabel(imagem);
        
        public Exemplo14_ImageIcon(){  
        
        add(label);
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo14_ImageIcon();
        
    }
}

