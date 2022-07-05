

package InterfaceGrafica;
import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exemplo28_JTabbedPane extends JFrame{
    
    JTabbedPane abas = new JTabbedPane();
    JPanel painelBack = new JPanel();
    JPanel painelWhite = new JPanel();
    JPanel painelGray = new JPanel();
    
    public Exemplo28_JTabbedPane(){
        configurarJanela();
        add(BorderLayout.CENTER,abas);
        abas.addTab("Painel Black", painelBack);
        abas.addTab("Painel White" , painelWhite);
        abas.addTab("Painel Gray", painelGray);
        painelBack.setBackground(Color.BLACK);
        painelWhite.setBackground(Color.WHITE);
        painelGray.setBackground(Color.GRAY);
        abas.addChangeListener(new ChangeListener() {         
            public void stateChanged(ChangeEvent ce) {
                int aba = abas.getSelectedIndex();
                String titulo = abas.getTitleAt(aba);
                System.out.println(titulo);
            }
        });
    }
    public void configurarJanela(){
        setTitle("Janela com varias abas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[]args){
        new Exemplo28_JTabbedPane();
    }

    
}
