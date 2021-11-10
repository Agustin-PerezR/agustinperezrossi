package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public  class SistemaSupermercado implements SistemaDeVentas {
    private String nombre;
    private HashSet<ProductoDeSuper> productosDisponibles;
    private ArrayList<ProductoDeSuper> productosVendidos;

    @Override
    public float gananciaTotalObtenida() {
        return 0;
    }

    @Override
    public float ingresosTotales() {
        return 0;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return 0;
    }
    public void agregarProductoVendido(){
      int aux= 0;
     while (aux== 0){
         try {


             Scanner ingresar = new Scanner(System.in);
             System.out.println("ingrese nombre del producto");
             String nombre = ingresar.nextLine();
             System.out.println("ingrese origen");
             String origen = ingresar.nextLine();
             System.out.println("ingrese codigo");
             int codigo = ingresar.nextInt();
             System.out.println("ingrese costo");
             float costo = ingresar.nextFloat();
             Producto producto =new Producto() {
                 @Override
                 public float calcularPrecioFinal() {
                     return 0;
                 }

                 @Override
                 public float calcularGananciaObtenida() {
                     return 0;
                 }

                 @Override
                 public String tipoDeProducto() {
                     return null;
                 }
             {
                 }
             };
             aux = 1;
             }catch (InputMismatchException excepcion) {
             excepcion.printStackTrace();
             System.out.println("Tipos de datos incorrectos, ingrese de nuevo.");
         }


         }

     }
    }


