
package InterfaceGrafica;

import javax.swing.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Exemplo15_GetKeyChar extends JFrame {
       
        public Exemplo15_GetKeyChar(){  
        
        addKeyListener(new KeyAdapter() {    
          public void keyPressed(KeyEvent e){
              char letra = e.getKeyChar();
              
              System.out.println(letra);
            }  
        });
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo15_GetKeyChar();
        
    }
}

