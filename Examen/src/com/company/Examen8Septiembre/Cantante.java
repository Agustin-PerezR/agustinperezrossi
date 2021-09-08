package com.company;

import java.util.ArrayList;

public class Cantante extends Persona{
    private String nombreArtistico;
    private ArrayList<Album> albumes;
    private static int precioMin = 500;

    public Cantante(String nombreArtistico, ArrayList<Album> albumes) {
        this.nombreArtistico = nombreArtistico;
        this.albumes = albumes;
    }

    public Cantante(String nombre, String apellido, int edad, String nombreArtistico, ArrayList<Album> albumes) {
        super(nombre, apellido, edad);
        this.nombreArtistico = nombreArtistico;
        this.albumes = albumes;
    }




    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public static int getPrecioMin() {
        return precioMin;
    }


}
