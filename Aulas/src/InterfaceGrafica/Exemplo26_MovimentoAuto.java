
package InterfaceGrafica;
import javax.swing.*;
public class Exemplo26_MovimentoAuto extends JFrame{
    
    JLabel lCarro1 = new JLabel(new ImageIcon(getClass().getResource("carro1.png")));
    JLabel lCarro2 = new JLabel(new ImageIcon(getClass().getResource("carro2.png")));
    JLabel lCarro3 = new JLabel(new ImageIcon(getClass().getResource("carro3.png")));
    
    public Exemplo26_MovimentoAuto(){
        editarJanela();
        new Movimento().start();
        
    }
    
    public void editarJanela(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,350);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        lCarro1.setBounds(0, 0, 200, 100);
        lCarro2.setBounds(0, 100, 200, 100);
        lCarro3.setBounds(0, 200, 200, 100);
        add(lCarro1);
        add(lCarro2);
        add(lCarro3);
    }
    
    public class Movimento extends Thread{
        public void run(){
            while(true){
                try{
                    sleep(20);
                }catch (Exception erro){
                    
                }
                if (lCarro1.getX() < 1200){
                    lCarro1.setBounds(lCarro1.getX() + 5, 0, 200, 100);
                }
                if (lCarro2.getX() < 1200){
                    lCarro2.setBounds(lCarro1.getX() + 8, 100, 200, 100);
                }
                if (lCarro3.getX() < 1200){
                    lCarro3.setBounds(lCarro1.getX() + 10, 200, 200, 100);
                }    
            }
        }
    }
    public static void main(String[] args){
        new Exemplo26_MovimentoAuto();
    }
}
