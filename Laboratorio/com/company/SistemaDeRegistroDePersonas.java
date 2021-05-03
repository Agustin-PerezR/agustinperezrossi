package com.company;
import java.util.ArrayList;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas;

    public SistemaDeRegistroDePersonas(Persona p){
        this.personas.add(p);

    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
