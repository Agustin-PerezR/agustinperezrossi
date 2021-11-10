package com.company;

public  class PruductoPerecedero extends ProductoAlimenticio{
    float temperaturaMinimaDeFrio;

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
