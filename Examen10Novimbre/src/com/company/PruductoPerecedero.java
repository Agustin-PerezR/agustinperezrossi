package com.company;

public  class PruductoPerecedero extends ProductoAlimenticio{
    float temperaturaMinimaDeFrio;
    int cantDiasParaVencerse;

    public PruductoPerecedero(String nombre, String origen, int codigo,  float costo,int cantDiasParaVencerse, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo,costo);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    @Override
    public String tipoDeProducto() {
        return "ProductoPerecedero";
    }

    public float getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }
}
