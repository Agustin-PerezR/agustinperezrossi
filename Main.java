package com.company;

public class Main {

    public static void main(String[] args) {
	Persona p = new Persona();
	String n = p.getNombre();
	System.out.println(n);
	p.setNombre("Carlos");
	n= p.getNombre();
	System.out.println(n);
	Persona e = new Persona();
	int ed = p.getEdad();
	System.out.println(e);
	p.setEdad(90);
	ed= e.getEdad();
	System.out.println(ed);
    }
}
