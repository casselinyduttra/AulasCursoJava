
package InterfaceGrafica;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Exemplo19_JTread extends JFrame{
    
    JLabel tempo = new JLabel();
    JLabel idade = new JLabel();
    int segundo = 0;
    
    public Exemplo19_JTread(){
        
        editarLayout();
        contarTempo obj = new contarTempo();
        obj.start();
        mostrarMensagem();
        obj.stop();
        
        
    }
    public void editarLayout(){
        Font fonte = new Font("Arial", Font.BOLD, 50);
        Font fonte2 = new Font("Arial", Font.BOLD, 30);
        
        add(BorderLayout.NORTH,tempo);
        add(BorderLayout.CENTER, idade);
        
        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setFont(fonte);
        tempo.setFont(fonte2);
        
        setTitle("Titulo da Janela");
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void mostrarMensagem(){
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano nasceu?"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int resultado = anoAtual - anoNasc;
        idade.setText("Sua idade é "+resultado);
        JOptionPane.showMessageDialog(null,"Gastastes "+segundo + "segundos para responder");
    }
    
    public class contarTempo extends Thread{
         public void run(){
             while(true){
                try{
                Thread.sleep(1000);
                }catch(Exception e){
                
                }
                segundo++;
                tempo.setText(segundo + " ");
        }
    }
}
    public static void main(String []args){
        new Exemplo19_JTread();
    }
}
