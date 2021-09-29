package com.company.Examen29Deptiembre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private  String direccion;
    private ArrayList<Sala> salas;



    public Cine(String nombre, String direccion, ArrayList<Sala> salas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
    }

    public HashSet<Integer> visitantes(){
        HashSet<Integer> visitantes = new HashSet<>();

        for (Sala aux:salas) {
        ArrayList <Visitante> visitantesAux = aux.getEspectadoresPresentesAlgunaVez();
            for (Visitante v: visitantesAux) {
                visitantes.add(v.getId());
            }

        }
        return visitantes;
    }
    public  int cantidadTotalDeVisitantes(){
        int cantTotal = visitantes().size();
        return cantTotal;
    }
    public HashMap<Integer,Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer,Integer> cantVisitas = new HashMap<>();
        for (Sala aux: salas){
            cantVisitas = aux.visitantesConCantidadDeVisita();
        }
        return cantVisitas;
    }

    @Override
    public String toString(){
        String datos= "";
        for (Sala aux:this.salas
             ) {
             datos= "Numero sala: " + aux.getNumeroSala() + "\n"+"Cantidad asientos: " + aux.getCantAsintosSala() +"\n"
                    + "capacidad máxima permitida: "+ aux.getCapacidadMax() + "\n" + "cantidad de visitantes presentes: " + aux.cantidadDeVisitantesPresentes()
                    +"\n" + "cantidad de asientos disponibles: " + aux.asientosDisponibles();
        }
        return datos;
    }
    public static void informeDatos(String datos){
        System.out.println(datos);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
}
