package com.company;

public  class ProductoDeCalefaccion extends ProductoElectrico{
    private float wattsDePotenciaMax;

    public ProductoDeCalefaccion(String nombre, String origen, int codigo, float cost, int cantDiasDeGarantia, float wattsDePotenciaMax) {
        super(nombre, origen, codigo, cost, cantDiasDeGarantia);
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    @Override
    public String tipoDeProducto() {
        return "ProductoDeCalefaccion";
    }

    public float getWattsDePotenciaMax() {
        return wattsDePotenciaMax;
    }

    public void setWattsDePotenciaMax(float wattsDePotenciaMax) {
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }
}
