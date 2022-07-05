
package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Exemplo18_JMenu extends JFrame {
       
    //barra do menu:
    JMenuBar barra = new JMenuBar();
    
    JMenu menu1 = new JMenu("Opcoes");
    JMenu menu2 = new JMenu("Sair");
    
    JMenuItem item1 = new JMenuItem("Exit");
    
        public Exemplo18_JMenu(){    
        
        //adicionar a barra:
        setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);
        
        menu2.add(item1);
        
        //Atribuicao do click ao "Exit" para sairç:
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }     
        });
        
        setTitle("Titulo da Janela");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo18_JMenu();
        
    }
}

