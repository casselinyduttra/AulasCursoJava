  // * meus comentarios.
//fazer uma janela com soma.

package InterfaceGrafica;

//bibliotecas expecifica para cada coisa.
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaSoma extends JFrame {
  
    //botao:
    JButton sinalIgual = new JButton (" = ");
   
    //label:
    JLabel sinalMais = new JLabel("  +");
    JLabel resultado = new JLabel();
    Font fonte = new Font("Serif", Font.PLAIN | Font.ITALIC, 40);
    Color cor = new Color(0 ,0 ,0 );
   
    //caixa de texto:
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    
    public JanelaSoma(){
        
        //interface que vai tratar a acao:
        sinalIgual.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int soma = n1 + n2;
            resultado.setText(soma + " ");
        }
    });
    
        // serve p/ adicionar os parametros que vai aparecer na janela;
        //a ordem de colocacao é a ordem que vai aparecer na janela
        //esquerda p direita:
        add(num1);         
        add(sinalMais);           
        add(num2);        
        add(sinalIgual); 
        add(resultado);
        
        //serve p/ colocar a fonte em tds os parametros:
        num1.setFont(fonte);
        num2.setFont(fonte);
        sinalMais.setFont(fonte);
        resultado.setFont(fonte);
        sinalIgual.setFont(fonte);
        
        //serve p/ add cor aos numero e fundo:       
        num1.setBackground(cor); // cor de fundo
        num2.setBackground(cor); // cor de fundo
        num1.setForeground(Color.WHITE); // cor da letra
        num2.setForeground(Color.WHITE); // cor da letra
                 
        //definicoes da janela:
        setLayout(new GridLayout(1,5)); //aqui é 1 linha com 5 colunas
        sinalMais.setBounds(100, 0, 100, 60);
        sinalIgual.setBounds(300, 0, 100, 60);
        setTitle("Soma");
        setSize(600,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);        
        
    }
    
    public static void main(String []args){
        new JanelaSoma();
    }
     

    }

