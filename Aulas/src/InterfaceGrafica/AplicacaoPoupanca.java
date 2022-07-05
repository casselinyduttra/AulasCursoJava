
package InterfaceGrafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class AplicacaoPoupanca extends JFrame {
    
    JLabel periodoAnos = new JLabel();
    JLabel jurosMes = new JLabel();
    JLabel totalPoupado = new JLabel();
    JLabel depositoMensal = new JLabel();
    JLabel resultado = new JLabel();
    
    JButton ok = new JButton("Calcular");
    
    JTextField caixaJuros = new JTextField();
    JTextField caixaAnos = new JTextField();
    JTextField caixaDeposito = new JTextField();
    
    Color cor = new Color(255,45 ,78 );
    Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 90);
      
    public AplicacaoPoupanca(){       
           
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){              
                double juros = Integer.parseInt(jurosMes.getText());
                int ano = Integer.parseInt(periodoAnos.getText());
                double deposito = Integer.parseInt(depositoMensal.getText());
                int pagamentos = ano * 12;
                double total=0;
            
                    for( int i = 0; i < pagamentos; i++ ){
                    total = total + deposito;
                    total = (total + total) * juros;
                    }
            
            JOptionPane.showMessageDialog(null, "Valor Total:" + total);   
            }        
        });
        // fonte:
        
        periodoAnos.setFont(fonte);
            jurosMes.setFont(fonte);
                totalPoupado.setFont(fonte);
                    depositoMensal.setFont(fonte);
                        resultado.setFont(fonte);
                            caixaJuros.setFont(fonte);
                                caixaAnos.setFont(fonte);
                                    caixaDeposito.setFont(fonte);
                                        ok.setFont(fonte);
       
        // cor:   
        periodoAnos.setForeground(Color.PINK); 
        jurosMes.setForeground(Color.PINK); 
        totalPoupado.setForeground(Color.PINK);
        depositoMensal.setForeground(Color.PINK);
        resultado.setForeground(Color.PINK);
        caixaJuros.setForeground(Color.PINK);
        caixaAnos.setForeground(Color.PINK);
        caixaDeposito.setForeground(Color.PINK);
        ok.setForeground(Color.PINK);
        
        // labels, caixa de texto e adcao dos parametros a janela:
        jurosMes = new JLabel("Juros ao mes: ");
            caixaJuros = new JTextField(15);
                add(jurosMes);
                    add(caixaJuros);
                        periodoAnos = new JLabel("Numero de anos: ");
                            caixaAnos = new JTextField(15);
                                add(periodoAnos);
                                    add(caixaAnos);
                                        depositoMensal = new JLabel("Deposito Mensal €: ");
                                            caixaDeposito = new JTextField(15);
                                                add(depositoMensal);
                                                    add(caixaDeposito);
                                                        totalPoupado = new JLabel("Total Poupado €: ");
                                                            add(totalPoupado);
                                                                resultado = new JLabel(" ");
                                                                    add(resultado);
                                                                        ok = new JButton(" ok ");
                                                                            add(ok);        
               
        //definicoes da janela:
        setTitle("Calculadora de Poupança");
        setLayout(new GridLayout(5,2)); //aqui sao 5 linha com 1 colunas
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ok
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(50, 100, 310, 150);       
    }
    
      public static void main(String[] args){
         new AplicacaoPoupanca();
    }   
    
}
