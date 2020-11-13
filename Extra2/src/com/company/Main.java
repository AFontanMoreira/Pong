package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ejercicio1----------------------

        Scanner datos = new Scanner(System.in);
         Extra2_1 obj1 = new Extra2_1();
        boolean padreSocio;
        String preguntaPadreSocio = "";
        int edad;
        System.out.println("Edad del nuevo socio?");
        edad = datos.nextInt();
        if (edad < 21){
            System.out.print("tiene algun padre socio?");
            System.out.println("(si/no)");
            preguntaPadreSocio = datos.next();
        }
        if (preguntaPadreSocio.equalsIgnoreCase("si")){
              padreSocio=true;
         }else padreSocio=false;
        obj1.Ej1(edad,padreSocio);

        //Ejercicio2---------------------

        Extra2_2 obj2 = new Extra2_2();
        int dia,mes,año;
        System.out.println("Dame el dia de la fecha:");
        dia = datos.nextInt();
        System.out.println("Dame el mes de la fecha:");
        mes = datos.nextInt();
        System.out.println("Dame el año de la fecha:");
        año = datos.nextInt();
        boolean valido = obj2.Ej2(dia,mes,año);
        if (valido == true){
            System.out.println("La fecha es valida");
        }else System.out.println("La fecha no es valida");
    }
}


