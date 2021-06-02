package com.company.herencias;

class Herencia {
    public static void main(String[] args) {
        Hijo hijo;
        String nombre = "Pablo";
        int edad = 12;
        int dni = 123;
        hijo= new Hijo(nombre, edad, dni);
        hijo.MenorDeEdada(edad) ;
        Madre madre= new Madre(nombre, edad, dni, hijo);
        madre.MeonoresDeEdad(hijo,edad);

    }
}