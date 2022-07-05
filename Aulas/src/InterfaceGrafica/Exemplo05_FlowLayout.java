
package InterfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class Exemplo05_FlowLayout extends JFrame {
    
       
       JButton botao1 = new JButton ("Botão 1");
       JButton botao2 = new JButton ("Botão 2");
       JButton botao3 = new JButton ("Botão 3");
       
    public Exemplo05_FlowLayout(){    
        
        //posicionar os botoes superior esauerda ou direita
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        //a forma como coloco os botoes aqui, e como
        //vai aparecer no ecra:
        add(botao3);
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
        new Exemplo05_FlowLayout();
        
    }
}