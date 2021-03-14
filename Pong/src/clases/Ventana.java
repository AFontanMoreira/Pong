package clases;

import javax.swing.*;

public class Ventana extends JFrame {
    private final int ancho=800,alto=500;
    private TableroJuego lamina;
    private Hilo hilo;

    public Ventana(){
        setTitle("Pong");
        setSize(ancho,alto);
        setLocationRelativeTo(null); //ubicando ventana en el centro de la pantalla
        setResizable(false);
        lamina =new TableroJuego();
        add(lamina);
        addKeyListener(new EventoTeclado());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo=new Hilo(lamina);
        hilo.start();

    }

}
