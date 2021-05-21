package com.company;
import com.company.Persona;


import java.util.ArrayList;

class clase28_04 {
    public static void main(String[] args) {
        Persona p = new Persona();

        String nombre = p.getNombre();
        int edad= p.getEdad();;
        int telefono= p.getTelefono();
        int dni= p.getDni();
        String direccion= p.getDireccion();
        SistemaDeRegistroDePersonas s = new SistemaDeRegistroDePersonas();
        Persona RegistP = new Persona();
        s.DarDeAlta(RegistP);
        s.DarDeBaja();


    }
}