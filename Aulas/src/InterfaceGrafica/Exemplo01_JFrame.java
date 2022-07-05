
package InterfaceGrafica;
import javax.swing.JFrame;
//Biblioteca grafica de janelas
public class Exemplo01_JFrame extends JFrame {
    
    public Exemplo01_JFrame(){      
        //os 6 promenores para criacao de um janela JAVA:
        
        //1.titulo da janela:
        setTitle("Titulo da Janela");
        //2.tamanho da janela em pixel:
        setSize(500,400);
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
        new Exemplo01_JFrame();
        
    }
}
