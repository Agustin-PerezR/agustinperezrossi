package com.company;

import java.util.ArrayList;

public class Sistema
{
    private ArrayList<Cantante> cantantes;

    public Sistema(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    public ArrayList<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }
    public ArrayList<Cantante> ingresarCantante (Cantante cantante){
        cantantes.add(cantante);
        return cantantes;
    }
    public  int CantidadDeAlbums(Cantante cantante){
        int cantidadAlbumes=0;
        for (int i = 0; i <cantante.getAlbumes().size() ; i++) {
            cantidadAlbumes= cantidadAlbumes + 1;
        }
        return cantidadAlbumes;
    }
    public int preciDeArtista(Cantante cantante){
        int precioCanciones= 0;
        int cantidadAlbumes= CantidadDeAlbums(cantante);
        precioCanciones= cantante.getPrecioMin() + cantidadAlbumes;
        return precioCanciones;
    }
    public void artistasConMasDe3albums (){

        for (Cantante aux : this.cantantes) {
            String nombre = "Nombre Artistico: " + aux.getNombreArtistico();
            int cantidadAlbumes= CantidadDeAlbums(aux);
            if(cantidadAlbumes>3){
                System.out.println("Nombre Artistico");
            }

        }
}
   @Override
   public String toString(){
        String concat="";
        for (Cantante aux : this.cantantes) {
            String nombre = "Nombre Artistico: " + aux.getNombreArtistico();
            String precio= "Precio canciones: " + preciDeArtista(aux);
            concat= nombre + precio;
        }
       System.out.println(concat);
        return concat;
   }
   public void imprimir(Cantante cantante){

        String nombre= cantante.getNombre();
        String apllido= cantante.getApellido();
        int edad= cantante.getEdad();
        String nombreArt = cantante.getNombreArtistico();
        String concatAlbum= "";
        String concatCanciones="";
       for (int i = 0; i <cantante.getAlbumes().size() ; i++) {
           concatAlbum= concatAlbum + "- Album: " + cantante.getAlbumes().get(i).getNombreAlbum()+"\n";
           
       }
        String concat= "Nombre : " + nombre +"\n"+ "Apellido: " + apllido +"\n" + "Edad: " + edad +"\n" + concatAlbum +"\n" ;
       System.out.println(concat);

}

}
