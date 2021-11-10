package com.company;

public abstract class ProductoDeSuper implements Producto {
    private String nombre;
    private String origen;
    private int codigo;
    private float costo;

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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
