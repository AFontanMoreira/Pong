package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Ejercicio1------------
	/*Boletin9_1 Ej1 = new Boletin9_1();
	Ej1.Ej1();
	int ceros=Ej1.getCeros(),negativos=Ej1.getnNegativos(),positivos=Ej1.getnPositivos();
        System.out.println("Hay "+positivos+" positivos, "+negativos+" negativos y "+ ceros+" ceros");

    }

	 */
        //Ejercicio2------------
        /*
        Boletin9_2 Ej2 = new Boletin9_2();
        System.out.println("suma= "+Ej2.operacionSuma());
        System.out.println("Producto="+Ej2.operacionProducto());
        */

        //Ejercicio3-----------
        /*
        Boletin9_3 Ej3 = new Boletin9_3();
        float base,altura;
        System.out.println("Base:");
        base=datos.nextFloat();
        System.out.println("Altura:");
        altura=datos.nextFloat();
        System.out.println("El area es= "+Ej3.areaRectangulo(base,altura));
        */
        //Ejercicio4----------

        Boletin9_4 Ej4 =new Boletin9_4();
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        while (numero != 0){
            Ej4.Ej4(numero);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero (0 para salir)"));
        }


        //Ejercicio5----------
        /*
        Boletin9_5 Ej5 = new Boletin9_5();
        int sueldo,trabajadores=0,bajo=0;
        float porcentaje;
        System.out.println("Dame un sueldo");
        sueldo= datos.nextInt();
        while (sueldo != 0){
            trabajadores++;
            if (Ej5.Ej5(sueldo)==false){
                bajo++;
            }
            System.out.println("Dame otro sueldo (o para salir)");
            sueldo= datos.nextInt();

        }
        porcentaje=bajo*100/trabajadores;
        System.out.println("Un "+porcentaje+"% de trabajadores tienen un sueldo mas bajo de 1000.");
        */

    }
}
