package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    //Ejercicio1-------------------------
	Boletin7_1 obj1 = new Boletin7_1();
	obj1.Ej7_1(Integer.parseInt(JOptionPane.showInputDialog("Dame un numero.")));
    //Ejercicio2-------------------------
	Boletin7_2 obj2 = new Boletin7_2();
    System.out.println("Primer numero:");
    short num1 = dato.nextShort();
    System.out.println("Segundo numero:");
    short num2 = dato.nextShort();
    obj2.Ej7_2(num1,num2);
    //Ejercicio3------------------------
    Boletin7_3 obj3 = new Boletin7_3();
    obj3.Ej7_3(Integer.parseInt(JOptionPane.showInputDialog("Dame un numero.")));
    //Ejercicio4------------------------
    Boletin7_4 obj4 = new Boletin7_4();
    String nome1,nome2;
    float peso1,peso2;
    System.out.println("Dame dos nombres");
    nome1=dato.next();
    nome2=dato.next();
    System.out.println("Dame sus pesos correspondientes:");
    peso1 = dato.nextFloat();
    peso2 = dato.nextFloat();
    obj4.Ej7_4(nome1,peso1,nome2,peso2);
    //Ejercicio5-----------------------
    Boletin7_5 obj5 = new Boletin7_5();
    int numero1,numero2,numero3;
        System.out.println("Primer numero");
    numero1=dato.nextInt();
        System.out.println("Segundo numero");
    numero2=dato.nextInt();
        System.out.println("Tercer numero");
    numero3=dato.nextInt();
    obj5.Ej7_5(numero1,numero2,numero3);
    }


}
