package com.company;

public abstract class ProductoDeSuper implements Producto {
    private String nombre;
    private String origen;
    private int codigo;
    private float cost;

    public ProductoDeSuper(String nombre, String origen, int codigo, float cost) {
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.cost = cost;
    }

    @Override
    public float calcularGananciaObtenida() {
        return 10;
    }

    @Override
    public String tipoDeProducto() {
        return "ProductoDeSuper";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
