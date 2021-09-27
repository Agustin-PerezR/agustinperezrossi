package com.company.Tienda;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private float precio;
    private static float descuento = 30;

    public Producto(String codigo, String nombre, int stock, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    public float precioConDescuento(){
       float descuentoProd= this.precio * (this.descuento/100);
       float precioFinal= this.precio - descuentoProd;
       return precioFinal;
    }
    static void imprimirInformación(){
      
        System.out.println(datos);

    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static float getDescuento() {
        return descuento;
    }

    public static void setDescuento(float descuento) {
        Producto.descuento = descuento;
    }
}
