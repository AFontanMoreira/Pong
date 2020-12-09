package com.company;

import java.util.Scanner;

public class Ej2 {
    public Ej2() {
        Scanner sc = new Scanner(System.in);
        float celsius;
        System.out.println("Intoduce os grados celsius: ");
        celsius =sc.nextFloat();
        System.out.println("Os "+ celsius +"ºC equivalen a:" +"\n" +((celsius*1.8)+32)+"grados Fharenheit. \n"+(celsius+273.15)+"Kelvin.");
    }
}
