
package InterfaceGrafica;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;

public class Exemplo23_TocarSom extends JFrame{
    
    JButton tocar = new JButton("Audio");
    
    public Exemplo23_TocarSom(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setLocation(null);
        setVisible(true);
        
        add(tocar);
        tocar.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                play("som");
            }
            });       
    }
    public void play(String nomeDoAudio){
        URL url =  Exemplo23_TocarSom.class.getResource(nomeDoAudio + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
    public static void main(String[] args){
        new Exemplo23_TocarSom();
    }
}
