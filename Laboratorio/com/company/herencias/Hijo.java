package com.company.herencias;


import com.company.Persona;

public class Hijo extends Persona {
    private String escuela;
    private String juegoFav;

    public Hijo(String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.escuela ="Politecnico";
        this.juegoFav = "Fornite";
    }
    boolean MenorDeEdada( int edad){
        if( edad< 18){
            System.out.println("es menor");
        }
        else {
            System.out.println("es mayor");
        }
        return edad < 18;
    }
}
