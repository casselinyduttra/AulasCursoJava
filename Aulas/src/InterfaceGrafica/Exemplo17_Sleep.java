
package InterfaceGrafica;

//bibliotecas expecifica para cada coisa.
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;


public class Exemplo17_Sleep extends JFrame {
  
    JLabel numero = new JLabel("0");
    Font fonte = new Font("Arial", Font.BOLD, 80);

    
    public Exemplo17_Sleep(){
    
        numero.setFont(fonte);
        numero.setHorizontalAlignment(SwingConstants.CENTER);
        add(numero);
        
        //definicoes da janela:
        setTitle("Titulo da janela");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);        
        
    }
    
    public void contagem(){
        int n = 0;
        while(true){
            numero.setText(n + " ");
            n++;
            try{
               Thread.sleep(1000);             
            }catch( Exception erro){
                
            }
        }
    } 
    
    public static void main(String []args){
        Exemplo17_Sleep obj = new Exemplo17_Sleep ();
        obj.contagem();
    }
     

    }

