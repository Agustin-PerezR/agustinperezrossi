package com.company;

public  class ProductoDeCalefaccion extends ProductoElectrico{
    private float wattsDePotenciaMax;

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
