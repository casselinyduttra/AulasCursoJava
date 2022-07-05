
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Exemplo11_JCheckbox extends JFrame {
         
      JCheckBox teste = new JCheckBox("Titulo", false);// false - é com o check desmarcado
      JCheckBox teste1 = new JCheckBox("Titulo", true); // true - é com o check marcado
    
        public Exemplo11_JCheckbox(){  
        
        setLayout(new FlowLayout());
        add(teste);
        add(teste1);
        
        System.out.println(teste.isSelected());
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo11_JCheckbox();
        
    }
}

