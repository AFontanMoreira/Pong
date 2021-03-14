package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableroJuego extends JPanel {
    //Creamos la pelota con las coordenadas de inicio
    TableroJuego lamina;
    Pelota pelota = new Pelota(0,0);

    Raqueta r1 = new Raqueta(10,200);
    Raqueta r2 = new Raqueta(794-10-10-Raqueta.ANCHO,200);

    public TableroJuego(){
    //Ponemos color de fondo
        setBackground(Color.BLACK);

    }

    public void paintComponent(Graphics g){
    //Dibujamos y actualizamos el movimento de la pelota y le damos el color
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.WHITE);
        dibujar(g2);
        actualizar();

    }

    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
    }
    public  void actualizar(){
        pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
    }
    public void iterarJuego(){
        while (true){
            repaint();
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                Logger.getLogger(TableroJuego.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }
    private  boolean colision(Rectangle2D r){
        return pelota.getPelota().intersects(r);
    }
}
