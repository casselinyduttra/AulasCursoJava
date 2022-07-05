
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Exemplo12_JRadioButton extends JFrame {
         
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino"); 
        
        JRadioButton fuma = new JRadioButton("Fumas");
        JRadioButton naoFuma = new JRadioButton("Nao Fumas"); 
        
        ButtonGroup grupo = new ButtonGroup();
        ButtonGroup grupo2 = new ButtonGroup();
        
        public Exemplo12_JRadioButton(){  
        
        setLayout(new FlowLayout());
        add(masculino);
        add(feminino);
        
        add(fuma);
        add(naoFuma);
        
        grupo.add(masculino);
        grupo.add(feminino);
        
        grupo2.add(fuma);
        grupo2.add(naoFuma);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo12_JRadioButton();
        
    }
}

