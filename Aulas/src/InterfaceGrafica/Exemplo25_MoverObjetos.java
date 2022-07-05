
package InterfaceGrafica;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Point;

public class Exemplo25_MoverObjetos extends JFrame {
    
    boolean mousePressionado = false;
    ImageIcon iconBarataViva = new ImageIcon(getClass().getResource("barata.gif"));
    
    
    JLabel l = new JLabel(iconBarataViva);
    
    public Exemplo25_MoverObjetos () {
        editarJanela();
        int x = (int)(Math.random() * 700);
        int y = (int)(Math.random() * 600);
        
        l.setBounds(x,y,250,150);
        new Mover().start();
        l.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) { //clique do rato
               
            }

            @Override
            public void mousePressed(MouseEvent me) { 
                mousePressionado = true;
            }

            @Override
            public void mouseReleased(MouseEvent me) { //tira o dedo do rato
                mousePressionado = false;
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
    
    public class Mover extends Thread{ //extensao para fazer variaas coisas ao mesmo tempo
        public void run(){
            while(true){
                try {
                    sleep(10);                   
                } catch(Exception erro){
                    
                }
                if (mousePressionado){
                    Point ponto = getMousePosition();
                    l.setBounds(ponto.x-125, ponto.y-75, 250, 150);
                }
            }
    }
}
    public static void main (String[] args){
        new Exemplo25_MoverObjetos();
    }
    
}
