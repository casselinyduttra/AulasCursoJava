
package InterfaceGrafica;
import java.awt.Desktop;
import javax.swing.*;
import java.net.URI;

public class Exemplo22_AbrirLink {
    

    public static void main(String []args){
        
        try{
            URI link = new URI ("www.google.pt");
            Desktop.getDesktop().browse(link);
         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "erro");
        }
    }
}
