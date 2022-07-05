
package InterfaceGrafica;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.*;
public class Exemplo21_EscreverFicheiro extends JFrame{
    

    public static void main(String []args){
        
        Path caminho = Paths.get("C:\\Users\\casse\\OneDrive\\Documentos\\java1.txt");
        
        
            String texto = JOptionPane.showInputDialog("O que pretende colocar no bloco de notas?");
            byte[] textoEmByte = texto.getBytes();
            
        try{
            
            
           Files.write(caminho, textoEmByte);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "erro");
        }
    }
}
