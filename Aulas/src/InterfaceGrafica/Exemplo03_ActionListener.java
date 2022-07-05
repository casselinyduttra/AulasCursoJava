/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exemplo03_ActionListener extends JFrame implements ActionListener{
           
       JButton botao1 = new JButton ("Mensagen");
       JButton botao2 = new JButton ("Sair");
       
        public void actionPerformed(ActionEvent e){
            
           if (e.getSource() == botao1){
               JOptionPane.showMessageDialog(null, "Curso de Java");
           }
           if (e.getSource() == botao2){
               System.exit(0);
           }
        }
        
        public Exemplo03_ActionListener(){  
        
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        
        setLayout(null);
        //posicao e localizacao dos botoes:
        //posicao 100 300 - largura e 60 altura
        botao1.setBounds(300, 200, 100, 60);
        //posicao 0 0 tamanho - 100 largura por 300 altura
        botao2.setBounds(0, 0, 100, 60);
        //adicionar os botoes a janela:
        add(botao1);
        add(botao2);
        
        //os 6 promenores para criacao de um janela JAVA:       
        //1.titulo da janela:
        setTitle("Titulo da Janela");
        //2.tamanho da janela em pixel:
        setSize(700,600);
        //3.visivel a toda gente na tela do pc:
        setVisible(true);
        //4.fechar o programa e deixar de rodar eocupar espaco na memoria:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //5.colocar a janela no centro:
        setLocationRelativeTo(null);
        //6.nao mexer no tamanho da janela, deixar ela em um tamanho escolhido:
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Exemplo03_ActionListener();
        
    }
}

