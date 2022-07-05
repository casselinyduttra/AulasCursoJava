
package InterfaceGrafica;
import javax.swing.*;
import java.awt.event.*;

public class Exemplo24_AcaoClique extends JFrame {
    ImageIcon iconBarataViva = new ImageIcon(getClass().getResource("barata.gif"));
    ImageIcon iconBarataMorta = new ImageIcon(getClass().getResource("barata.png"));
    
    JLabel l = new JLabel(iconBarataViva);
    
    public Exemplo24_AcaoClique () {
        editarJanela();
        int x = (int)(Math.random() * 700);
        int y = (int)(Math.random() * 600);
        
        l.setBounds(x,y,250,150);
        l.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) { //clique do rato
                l.setIcon(iconBarataMorta);
            }

            @Override
            public void mousePressed(MouseEvent me) { 
                
            }

            @Override
            public void mouseReleased(MouseEvent me) { //tira o dedo do rato
                
            }

            @Override
            public void mouseEntered(MouseEvent me) { //passa por dentro do objeto com o rato
                
            }

            @Override
            public void mouseExited(MouseEvent me) { //sai de dentro do objeto com o rato
                
            }
        });
        
    }
    public void editarJanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(l);
    }
    public static void main (String[] args){
        new Exemplo24_AcaoClique();
    }
    
}
