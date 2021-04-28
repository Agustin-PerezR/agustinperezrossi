
package com.company;

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        String n;
        float P;
        Scanner ingresar = new Scanner(System.in);
        int nuevoRegistro = 1;
        float Ptotal = 0;



        while (nuevoRegistro == 1) {
        System.out.println("ingrese nombre del producto");
        n = ingresar.nextLine();
        System.out.println("Ingrese precio del prducto");
        P = ingresar.nextFloat();
        Producto p= new Producto(n, P);
       Ptotal = Ptotal +P;
       n = ingresar.nextLine();
        System.out.println(n);
        System.out.println("Importe parcial: " + Ptotal + "\n");
        System.out.println("Para ingresar un nuevo registro aprete 1");
        nuevoRegistro= ingresar.nextInt();
            n = ingresar.nextLine();


       }
        System.out.println("Importe total: " +  Ptotal);
    }
}