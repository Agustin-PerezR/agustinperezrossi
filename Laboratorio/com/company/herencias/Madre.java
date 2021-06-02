package com.company.herencias;
import com.company.Persona;

import java.util.HashSet;

public class Madre extends Persona {
    private String empresa;
    private HashSet<Hijo> hijos;


    public Madre(String nombre, int edad, int dni, Hijo hijo) {
        super(nombre, edad, dni);
        this.empresa= "Dell";
        hijos = new HashSet<>();
        this.hijos.add(hijo);

   }
 public boolean MeonoresDeEdad(Hijo hijo, int edad){
        HashSet <Hijo> menores = new HashSet<>();
        if(hijo.getEdad() < 18){
           menores.add(hijo);
           for (int i = 0; i <menores.size() ; i++) {
                System.out.println("nombre: " +"  "+ hijo.getNombre() +"edad: "+ hijo.getEdad());
            }
        }
        

    return edad < 18;
    }

}
