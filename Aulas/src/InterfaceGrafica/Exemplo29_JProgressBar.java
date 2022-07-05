

package InterfaceGrafica;

import java.awt.*;
import javax.swing.*;


public class Exemplo29_JProgressBar extends JFrame{
    JProgressBar barra = new JProgressBar();
    
    public Exemplo29_JProgressBar(){
        configurarJanela();
        barra.setBounds(40,40, 500, 50);
        barra.setStringPainted(true);
        barra.setValue(50);
        barra.setMaximum(1000);
        barra.setForeground(new Color(50,200,50));
        add(barra);
        new Temporizador().start();
        
    }
    public void configurarJanela(){
        setTitle("Barra de Processo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,170);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
    
    public static void main(String[]args){
        new Exemplo29_JProgressBar();
    }

    public class Temporizador extends Thread{
        public void run(){
            while(barra.getValue() < 1000){
                try{
                    sleep(10);
                    barra.setValue(barra.getValue() + 1);
                }catch(Exception e{
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(null, "Carregado");
        }
    }
}
