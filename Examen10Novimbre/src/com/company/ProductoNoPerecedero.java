package com.company;
import java.util.HashSet;

public  class ProductoNoPerecedero extends ProductoAlimenticio{
private int mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float cost, int mgDeSodio, float deSodio) {
        super(nombre, origen, codigo, cost);
        this.mgDeSodio = mgDeSodio;
    }

    @Override
    public String tipoDeProducto() {
        return "ProductoNoPerecedero";
    }
    public HashSet<String> aptosParaHipertensos(){
        HashSet<String> ProductosAptos = new HashSet<>();
        if (mgDeSodio <= 1500){
            ProductosAptos.add(getNombre());
        }
        return ProductosAptos;

    }


    public int getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(int mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }
}
