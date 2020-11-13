package com.company;

public class Extra2_1 {
    private float cuota;
    public void Ej1(int edad,boolean padreSocio){
        if (edad > 65){
            cuota=800-((float)(40*800)/100);
            System.out.println("tendra que pagar "+cuota+" de cuota");
        }else if (edad < 21){
            if (padreSocio==true){
                cuota=800-((float)45*800/100);
                System.out.println("tendra que pagar "+cuota+" de cuota ");
            }else {                    cuota = 800 - (25f * 800 / 100);
            System.out.println("tendra que pagar " + cuota + " de cuota");
            }
        }else System.out.println("tendra que pagar "+800+" de cuota");
    }
}

