
package InterfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Exemplo02_JButton extends JFrame {
    
       
       JButton botao1 = new JButton ("Botão 1");
       JButton botao2 = new JButton ("Botão 2");
       
        public Exemplo02_JButton(){  
        
        setLayout(null);
        botao1.setBounds(100, 300, 100, 60);
        botao2.setBounds(0, 0, 100, 300);
        add(botao1);
        add(botao2);
         
        setTitle("Titulo da Janela");
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo02_JButton();
        
    }
}