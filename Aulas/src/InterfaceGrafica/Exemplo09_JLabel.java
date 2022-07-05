
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Exemplo09_JLabel extends JFrame {
         
       JLabel legenda = new JLabel("Texto");
       Font fonte = new Font("Serif", Font.ITALIC | Font.BOLD, 50);
    
        public Exemplo09_JLabel(){  
        
        legenda.setFont(fonte);
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        legenda.setText("Outro Texto"); //esse texto vai substituir o texto escrito la encima.
        
        add(legenda);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo09_JLabel();
        
    }
}

