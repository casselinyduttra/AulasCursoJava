
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

//CAIXA DE TEXTO

public class Exemplo10_JTextField extends JFrame {
         
        JTextField caixa = new JTextField();
        
        public Exemplo10_JTextField(){  
        
        add(caixa);
        caixa.setText("Aula");
        String texto = caixa.getText();
        System.out.println(texto);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo10_JTextField();
        
    }
}

