package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Persona persona = new Persona("Carlos","Sanchez",12);
        persona.imprimir(persona);
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Cancion 1");
        canciones.add("Cancion 2");
        canciones.add("Cancion 3");
        Album album= new Album("Album 1",canciones);
        album.setNombreAlbum("Album 1");
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album);
        Cantante cantante= new Cantante("Juan","Carlos",18,"Duki", albums);
        ArrayList<Cantante> cantantes = new ArrayList<>();
        Sistema sistema= new Sistema(cantantes);
        sistema.ingresarCantante(cantante);
        sistema.toString();
        sistema.artistasConMasDe3albums();
        sistema.imprimir(cantante);



    }
}
