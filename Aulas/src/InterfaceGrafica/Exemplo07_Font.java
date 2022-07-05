
package InterfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
public class Exemplo07_Font extends JFrame {
    
       
       JButton botao1 = new JButton ("Test 1");
       Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 90);
       
    public Exemplo07_Font(){  
        
        botao1.setFont(fonte);
        add(botao1);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo07_Font();
        
    }
}