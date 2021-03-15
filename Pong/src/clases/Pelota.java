package clases;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Pelota {
    private int x;
    private int y;
    private int dx=1,dy=1;
    private int ancho=15,alto=15;
    static int contadorIzquierda=0,contadorDerecha=0;
    public Pelota(int x, int y){

        this.x=x;
        this.y=y;

    }

    public Rectangle2D getPelota(){

        return new Rectangle2D.Double(x,y,ancho,alto);
    }

    public void mover(Rectangle limites, boolean colisionR1, boolean colisionR2){

        x += dx;
        y += dy;

        if (colisionR1){
            dx =- dx;
            x = 25;
        }
        if (colisionR2){
            dx =- dx;
            x = 745;
        }

        if (x > limites.getMaxX()-15){
            x=Ventana.ancho/2-15;
            y=Ventana.alto/2-15;
            contadorIzquierda++;
            System.out.println("izquierda"+contadorIzquierda);
        }
        if (y > limites.getMaxY()-15){
            dy =- dy;
        }
        if (x<=0){

            x=Ventana.ancho/2-15;
            y=Ventana.alto/2-15;
            contadorDerecha++;
            System.out.println("derecha"+contadorDerecha);
        }
        if (y<0){
            dy =- dy;
        }
    }
}
