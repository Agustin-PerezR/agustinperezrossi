package com.company.Almuerzo;
import java.util.Scanner;
class sistemaAlmuerzo {
    public static void main(String[] args) {
        Persona persona;
        Scanner ingresar= new Scanner(System.in);
        String nombre = "";
        String apellido= "";
        String division="";
        float descuento=0;
        String puesto= "";
        int dato=0;
        System.out.println("Ingrese 1 si es profesor o 2 si es alumno");
        dato= ingresar.nextInt();
        if(dato == 2){
            Alumno alumno;
            System.out.println("Ingrese su nombre");
            nombre= ingresar.nextLine();
            System.out.println("Ingresar apellido");
            apellido=ingresar.nextLine();
            System.out.println("ingrese su division");
            division=ingresar.nextLine();
            alumno = new Alumno(nombre,apellido,division);
            puesto= alumno.getClass().getSimpleName();
        }
        if(dato == 1){
            Profesor profesor;
            System.out.println("Ingrese su nombre");
            ingresar.nextLine();
            nombre= ingresar.nextLine();
            System.out.println("Ingresar apellido");
            apellido=ingresar.nextLine();
            profesor = new Profesor(nombre,apellido);
            puesto= profesor.getClass().getSimpleName();
        }
        persona= new Persona(nombre,apellido);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.cargarPedido(puesto, persona);
    }
}