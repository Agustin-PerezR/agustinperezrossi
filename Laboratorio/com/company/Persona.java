package com.company;
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private  String direccion;
    public Persona(){
        nombre ="Jose";
        edad= 35;
        dni= 232323;
        telefono= 54911847;
        direccion= "Larralde 2323";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
