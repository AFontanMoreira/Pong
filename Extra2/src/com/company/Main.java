package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
/*
        //Ejercicio1----------------------

         Extra2_1 obj1 = new Extra2_1();
        boolean padreSocio;
        String preguntaPadreSocio = "";
        int edad;
        System.out.println("Edad del nuevo socio?");
        edad = datos.nextInt();
        if (edad < 21){
            System.out.print("tiene algun padre socio?");
            System.out.println("(si/no) ");
            preguntaPadreSocio = datos.next();
        }
        if (preguntaPadreSocio.equalsIgnoreCase("si")){
              padreSocio=true;
         }else padreSocio=false;
        obj1.Ej1(edad,padreSocio);
*/
        //Ejercicio2---------------------
        Extra2_2 obj2 = new Extra2_2();
        int dia,mes,año;
        //Parte1
        /*System.out.println("Dame el dia de la fecha:");
        dia = datos.nextInt();
        System.out.println("Dame el mes de la fecha:");
        mes = datos.nextInt();
        System.out.println("Dame el año de la fecha:");
        año = datos.nextInt();
         */
        //Parte2
        String fecha;
        System.out.println("Dame la fecha: Ej(00/00/0000)");
        fecha = datos.next();
        String[] partes = fecha.split("/");
        dia = Integer.parseInt(partes[0]);
        mes = Integer.parseInt(partes[1]);
        año = Integer.parseInt(partes[2]);


        boolean valido = obj2.Ej2(dia,mes,año);
        if (valido == true){
            System.out.println("La fecha es valida");
        }else System.out.println("La fecha no es valida");
    }
}


