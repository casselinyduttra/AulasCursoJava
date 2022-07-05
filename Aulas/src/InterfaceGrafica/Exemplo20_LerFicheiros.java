
package InterfaceGrafica;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.*;
public class Exemplo20_LerFicheiros extends JFrame{
    

    public static void main(String []args){
        
        Path caminho = Paths.get("C:\\Users\\casse\\OneDrive\\Documentos\\java.txt");
        
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "erro");
        }
    }
}
