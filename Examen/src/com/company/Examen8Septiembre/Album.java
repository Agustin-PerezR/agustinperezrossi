package com.company;

import java.util.ArrayList;

public class Album {
    private String nombreAlbum;
    private ArrayList<String> canciones;



    public Album(String nombreAlbum, ArrayList<String> canciones, int precioCanciones) {
        this.nombreAlbum = nombreAlbum;
        this.canciones = canciones;

    }

    public Album(String nombreAlbum, ArrayList<String> canciones) {
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public ArrayList<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<String> canciones) {
        this.canciones = canciones;
    }


}
