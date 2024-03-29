package com.company.IntegradorTarjeta;

public class Pasajero
{
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(String nombre, String apellido, TarjetaEquis tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TarjetaEquis getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaEquis tarjeta) {
        this.tarjeta = tarjeta;
    }
}
