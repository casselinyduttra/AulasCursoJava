
package InterfaceGrafica;
import java.awt.Component;
import javax.swing.*;
public class Exemplo27_Colisao extends JFrame{
    
    JLabel lCarro1 = new JLabel(new ImageIcon(getClass().getResource("carro1.png")));
    JLabel lCarro2 = new JLabel(new ImageIcon(getClass().getResource("carro4.png")));
    
    
    public Exemplo27_Colisao(){
        editarJanela();
        new Movimento().start();
        
    }
    
    public void editarJanela(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,350);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        lCarro1.setBounds(0, 100, 200, 100);
        lCarro2.setBounds(1200, 100, 200, 100);    
        add(lCarro1);
        add(lCarro2);      
    }
    
    public class Movimento extends Thread{
        public void run(){
            while(true){
                try{
                    sleep(20);
                }catch (Exception erro){
                    
                }
                lCarro1.setBounds(lCarro1.getX() + 5, 0, 200, 100);
                lCarro2.setBounds(lCarro2.getX() - 5, 0, 200, 100);
                if (bateu (lCarro1, lCarro2)){
                    JOptionPane.showMessageDialog(null, "bateu!!");
                    System.exit(0);
                }
                
                 
            }
        }
    }
    public boolean bateu(Component a, Component b){
        int aX = a.getX();
        int aY = a.getY();
        int ladoDireitoA = aX + a.getWidth();
        int ladoEsquerdoA = aX;
        int ladoBaixoA = aY + a.getHeight();
        int ladoCimaA = aY;
        
        int bX = b.getX();
        int bY = b.getY();
        int ladoDireitoB = bX + b.getWidth();
        int ladoEsquerdoB = bX;
        int ladoBaixob = bY + b.getHeight();
        int ladoCimaB = bY;
        
        boolean bateu = false;
        boolean cDireita = false;
        boolean cCima = false;
        boolean cEsquerda = false;
         boolean cBaixo = false;
        
        if(ladoDireitoA >= ladoEsquerdoB){
            cDireita = true;           
        }
        if(ladoCimaA <= ladoBaixob){
            cCima = true;
        }
        if(ladoBaixoA >= ladoCimaB){
            cBaixo = true;
        }
        if(ladoEsquerdoA <= ladoDireitoB){
            cEsquerda = true;
        }
        if(cDireita && cEsquerda && cBaixo && cCima){
            bateu = true;
        }
        return bateu;
    }
    
    public static void main(String[] args){
        new Exemplo27_Colisao();
    }
}
