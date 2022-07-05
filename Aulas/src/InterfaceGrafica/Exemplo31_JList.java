

package InterfaceGrafica;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;


public class Exemplo31_JList extends JFrame{
    
   String[] paises = {"Portugal", "Inglaterra", "Japão", "Nigéria", "Rússia", "Suécia", "Ucrânia"};
    JList lista = new JList(paises);
    JLabel bandeira = new JLabel();
    
    public Exemplo31_JList(){
        configurarJanela();
        add(BorderLayout.WEST, lista);
        add(BorderLayout.CENTER, bandeira);
        lista.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
             int index = lista.getSelectedIndex();
             String pais = paises[index];
             bandeira.setIcon(new ImageIcon(getClass().getResource(pais + ".jpg")));
            }
        });
        
    }
    public void configurarJanela(){
        setTitle("Lista");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(335,210);
        setLocationRelativeTo(null);
        setVisible(true);       
    }
    
    public static void main(String[]args){
        new Exemplo31_JList();
    }

   
    }

