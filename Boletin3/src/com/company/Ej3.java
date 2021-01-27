package com.company;

import java.util.Scanner;

public class Ej3 {
    public Ej3() {
        Scanner sc = new Scanner(System.in);
        float b100,b20,b5,m1;
        System.out.println("Introduce o número de billetes de cen: ");
        b100=sc.nextFloat();
        System.out.println("Introduce o número de billetes de vinte: ");
        b20=sc.nextFloat();
        System.out.println("Introduce o número de billetes de cinco: ");
        b5=sc.nextFloat();
        System.out.println("Introduce o número de moedas de un: ");
        m1=sc.nextFloat();
        System.out.println("A suma de total de euros é de " +(b100*100+b20*20+b5*5+m1)+"€.");
    }
}
