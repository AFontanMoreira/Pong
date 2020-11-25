package com.company;

import javax.swing.*;

public class Boletin9_4 {
    private int numero,multiplicador=1,producto=0;
    public void Ej4(int num){
        numero=num;
    while(multiplicador !=0 ){
        multiplicador=Integer.parseInt(JOptionPane.showInputDialog("Por que numero lo quieres multiplicar. 0=Salir"));
        producto=numero*multiplicador;
        System.out.println(numero+"*"+multiplicador+"="+producto);
    }
    }
}
