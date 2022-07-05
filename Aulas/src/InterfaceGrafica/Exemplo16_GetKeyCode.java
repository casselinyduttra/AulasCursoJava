
package InterfaceGrafica;

import javax.swing.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Exemplo16_GetKeyCode extends JFrame {
       
        public Exemplo16_GetKeyCode(){  
        
        addKeyListener(new KeyAdapter() {    
          public void keyPressed(KeyEvent e){
              int codigo = e.getKeyChar();
              
              int tecla = KeyEvent.VK_ENTER;
              if(codigo == tecla){
                 System.out.println("Tecla enter pressionada"); 
              }
              
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
        new Exemplo16_GetKeyCode();
        
    }
}

