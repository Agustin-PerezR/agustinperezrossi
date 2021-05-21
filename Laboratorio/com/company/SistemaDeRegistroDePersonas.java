package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas;

    public SistemaDeRegistroDePersonas() {


    }

    public ArrayList<Persona> getPersonas(Persona p) {
        personas=new ArrayList<Persona>();
        personas.add(p);
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {

        this.personas = personas;
    }

    public void DarDeAlta(Persona RegistP ) {

        Scanner ingresarDatos = new Scanner(System.in);
        Scanner ingresarDatos2=new Scanner(System.in);

        System.out.println("Ingrese Nombre");
        String nombre= ingresarDatos.nextLine();
        System.out.println("Ingrese Edad");
        int edad = ingresarDatos.nextInt();
        System.out.println("Ingrese DNI");
        int dni= ingresarDatos.nextInt();
        System.out.println("Ingrese Telefono");
        int telefono= ingresarDatos.nextInt();
        System.out.println("Ingrese Direccion");
        String direccion= ingresarDatos2.nextLine();
        RegistP.setNombre(nombre);
        RegistP.setEdad(edad);
        RegistP.setDni(dni);
        RegistP.setTelefono(telefono);
        RegistP.setDireccion(direccion);
        System.out.println("Nombre: " + nombre  + "\n" + "Edad: " + edad + "\n" +
                           "DNI: " + dni + "\n" + "telefono: " + telefono  );
        personas.add(RegistP);
    }

    public void DarDeBaja() {
        System.out.println("Ingrese DNI para dar de baja");
        Scanner ingresarDni = new Scanner(System.in);

        int borrarDni = ingresarDni.nextInt();
        for (Persona p : personas) {
            p.setDni(borrarDni);


        }
    }}
