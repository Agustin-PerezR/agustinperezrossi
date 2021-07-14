package com.company.IntegradorTarjeta;

public class Viaje
{
    private  float precio;
    private  String hora;
    private String fecha;

    public Viaje(float precio, String hora, String fecha) {
        this.precio = precio;
        this.hora = hora;
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
