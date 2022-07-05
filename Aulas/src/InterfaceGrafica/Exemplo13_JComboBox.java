
package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Exemplo13_JComboBox extends JFrame {
         
        JComboBox <String> combo = new JComboBox<String>();
        
        public Exemplo13_JComboBox(){  
        
        setLayout(new FlowLayout());
        add(combo);   
        
        combo.addItem("Portugal");
        combo.addItem("Espanha");
        combo.addItem("França");
        
        combo.setSelectedIndex(1); // posso dizer o valor que quero abrir ou aparecer quando o formulario for aberto
        
        System.out.println(combo.getSelectedIndex()); //mostra o indice que esta selecionado
        System.out.println(combo.getSelectedItem()); //
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo13_JComboBox();
        
    }
}

