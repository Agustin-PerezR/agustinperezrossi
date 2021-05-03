package com.company;


import java.util.Scanner;
import java.util.ArrayList;

public class SistemaDeRegistro {
    private ArrayList<Producto2> productos;

    public SistemaDeRegistro() {
        this.productos = new ArrayList<>();
    }


    public void iniciarSistema() {
        int Elegir = 0;
        Scanner elegir = new Scanner(System.in);
        System.out.println("Opciones: " + "\n" + "1- Registrar Producto" + "\n" + "2- Importe Parcial" + "\n" + "3- Importe total");
        elegir.nextInt(Elegir);
        if (Elegir == 1) {
            RegistrarProducto();
        } else if (Elegir == 2) {
            verImporteParcial();
        } else {
            verImporteTotal();
        }


    }

    public void RegistrarProducto() {
        Producto2 p = new Producto2();
        float P = p.getPrecio();
        String n = p.getNombre();
        Scanner ingresar = new Scanner(System.in);
        System.out.println("ingrese nombre del producto");
        n = ingresar.nextLine();
        p.setNombre(n);
        System.out.println("Ingrese precio del prducto");
        P = ingresar.nextFloat();
        p.setPrecio(P);

    }

    public void verImporteParcial() {
        Producto2 p = new Producto2();
        float ImpParcial = 0;
        ImpParcial += p.getPrecio();
        System.out.println("Importe Parcial: " + ImpParcial);

    }

    public void verImporteTotal() {


    }

    public void agregarProducto(Producto2 p) {
        this.productos.add(p);
    }
}

