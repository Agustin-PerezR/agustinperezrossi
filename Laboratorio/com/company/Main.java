package com.company;


public class Main {

    public static void main(String[] args) {
	Persona p = new Persona();
	String n = p.getNombre();
	System.out.println(n);
	p.setNombre("Carlos");
	n= p.getNombre();
	System.out.println(n);

	int ed = p.getEdad();
	System.out.println(p);
	p.setEdad(90);
	ed= p.getEdad();
	System.out.println(ed);

	int dni = p.getDni();
	System.out.println(p);
	p.setDni(455445);
	dni= p.getDni();
	System.out.println(dni);

	int tel = p.getTelefono();
	System.out.println(p);
	p.setDni(549116534);
	tel= p.getTelefono();
	System.out.println(tel);

	String direc= p.getDireccion();
		System.out.println(p);
		p.setDireccion("Lugones 2342");
		direc= p.getDireccion();
		System.out.println(p);
    }
}
