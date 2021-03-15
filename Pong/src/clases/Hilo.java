package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo extends Thread {
    TableroJuego lamina;
    public Hilo(TableroJuego lamina){
        this.lamina=lamina;
    }
    public void run(){
        while (true){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null, e);
            }
            lamina.repaint();
        }
    }
}
