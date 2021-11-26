package com.company;

import java.util.HashMap;

public  class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, float cost, int cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, cost, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public HashMap<Integer,Float> productosRefrigeranteConCapacidad(){
        HashMap<Integer,Float> productos= new HashMap<>();
        Integer codigo;
        if(getOrigen()=="Argentina" && litrosDeCapacidad >= 300 ){
            codigo= getCodigo();
            productos.put(codigo, litrosDeCapacidad);
        }
        return productos;
    }
    @Override
    public String tipoDeProducto() {
        return "ProductoDeRefrigeracion";
    }
    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }

    public void setLitrosDeCapacidad(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }
}
