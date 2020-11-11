package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Ejercicio6----------
        System.out.println("Ejercicio6");
    Boletin8_6 envio = new Boletin8_6();
    String articulo = JOptionPane.showInputDialog("Nombre del articulo:");
    int ventas = Integer.parseInt(JOptionPane.showInputDialog("Numero de ventas:"));
    envio.Ej6(articulo,ventas);
    //Ejercicio7-----------
        System.out.println("Ejercicio6");
    Boletin8_7 figuras = new Boletin8_7();
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Numero de la figura:"));
    figuras.Ej7(opcion);
    }
}
