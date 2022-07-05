
package InterfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JButton; //biblioteca dos botoes
import java.awt.Font; // biblioteca das fontes
import java.awt.Color; // biblioteca das cores
public class Exemplo08_Color extends JFrame {
    
       
       JButton botao1 = new JButton ("Test 1");
       
       Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 90);
       Color cor = new Color(255,45 ,78 );
       //tabela de cores RGB
       //ou nas cores do word
    public Exemplo08_Color(){  
        
        botao1.setBackground(cor); // cor de fundo
        botao1.setForeground(Color.WHITE); // cor da letra
        botao1.setFont(fonte); // fonte da letra
        add(botao1);
        
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo08_Color();
        
    }
}