package com.company.Almuerzo;

public class Profesor extends Persona{
    private float descuento; //porcentaje
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.descuento=10;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
