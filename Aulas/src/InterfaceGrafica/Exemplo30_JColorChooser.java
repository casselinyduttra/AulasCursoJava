

package InterfaceGrafica;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Exemplo30_JColorChooser extends JFrame{
    
    JColorChooser caixaDeCores = new JColorChooser();
    JLabel titulo = new JLabel("Aula de Java - Cores");
    public Exemplo30_JColorChooser(){
        configurarJanela();
        add(BorderLayout.CENTER, caixaDeCores);
        add(BorderLayout.NORTH, titulo);
        titulo.setFont(new Font("Arial", Font.BOLD, 35));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        caixaDeCores.getSelectionModel().addChangeListener(new ChangeListener() {
            
            public void stateChanged(ChangeEvent ce) {             
                    Color corAtual = caixaDeCores.getColor();
                    titulo.setForeground(corAtual);
                
            }
        });
        
    }
    public void configurarJanela(){
        setTitle("Escolher Cor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650,650);
        setLocationRelativeTo(null);
        setVisible(true);       
    }
    
    public static void main(String[]args){
        new Exemplo30_JColorChooser();
    }

   
    }

