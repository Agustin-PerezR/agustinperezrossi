package com.company.Examen29Deptiembre;

import java.util.ArrayList;
import java.util.HashMap;

public class Sala {
    private  int numeroSala;
    private int cantAsintosSala;
    private ArrayList<Visitante> espectadoresPresentesAlgunaVez;
    private ArrayList<Visitante> espectadoresPresentes;
    private static int capacidadMax = 50;


    public Sala(int numeroSala, int cantAsintosSala, ArrayList<Visitante> espectadoresPresentesAlgunaVez, ArrayList<Visitante> espectadoresPresentes) {
        this.numeroSala = numeroSala;
        this.cantAsintosSala = cantAsintosSala;
        this.espectadoresPresentesAlgunaVez = espectadoresPresentesAlgunaVez;
        this.espectadoresPresentes = espectadoresPresentes;
    }

    public HashMap<Integer,Integer> nroDeAsientosConCantidadDePreferencias(){
        HashMap<Integer,Integer> cantidadEleccionesPorAsiento= new HashMap<>();
        int cantidad = 0;
        for (Visitante aux: this.espectadoresPresentesAlgunaVez) {
            int idAsiento= aux.getAsiento();
            if(espectadoresPresentesAlgunaVez.contains(idAsiento)){
                 cantidad= cantidad+1;
                 cantidadEleccionesPorAsiento.put(idAsiento,cantidad);
            }
            else{
                cantidadEleccionesPorAsiento.put(idAsiento,cantidad+1);
            }
        }

    return cantidadEleccionesPorAsiento;
    }
    public HashMap<Integer,Integer> visitantesConCantidadDeVisita(){
        HashMap<Integer,Integer> cantVisitas = new HashMap<>();
        int cantidad= 0;
        for (Visitante aux :espectadoresPresentesAlgunaVez) {
            int id = aux.getId();
            if(espectadoresPresentesAlgunaVez.contains(id)){
                cantidad= cantidad+1;
                cantVisitas.put(id,cantidad);

            }
            else {
                cantVisitas.put(id,cantidad+1);
            }
        }
        return cantVisitas;
    }
    public  int cantidadDeVisitantesPresentes(){
        int VisitantesPresentes= this.espectadoresPresentes.size();
        return VisitantesPresentes;
    }
    public boolean estaLLena(){
        int ocupacion = cantidadDeVisitantesPresentes();
        boolean llena= false;
        if(ocupacion == capacidadMax){
            llena = true;
        }
        return llena;
    }

    public boolean hayIntrusos(){
        int ocupacion = cantidadDeVisitantesPresentes();
        boolean llena= false;
        if(ocupacion >= capacidadMax){
            llena = true;
        }
        return llena;
    }

    public int asientosDisponibles(){
        int ocupacion = cantidadDeVisitantesPresentes();
        int asientosRestantes= this.cantAsintosSala - ocupacion;
        return  asientosRestantes;
    }
    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCantAsintosSala() {
        return cantAsintosSala;
    }

    public void setCantAsintosSala(int cantAsintosSala) {
        this.cantAsintosSala = cantAsintosSala;
    }

    public ArrayList<Visitante> getEspectadoresPresentesAlgunaVez() {
        return espectadoresPresentesAlgunaVez;
    }

    public void setEspectadoresPresentesAlgunaVez(ArrayList<Visitante> espectadoresPresentesAlgunaVez) {
        this.espectadoresPresentesAlgunaVez = espectadoresPresentesAlgunaVez;
    }

    public ArrayList<Visitante> getEspectadoresPresentes() {
        return espectadoresPresentes;
    }

    public void setEspectadoresPresentes(ArrayList<Visitante> espectadoresPresentes) {
        this.espectadoresPresentes = espectadoresPresentes;
    }

    public static int getCapacidadMax() {
        return capacidadMax;
    }

    public static void setCapacidadMax(int capacidadMax) {
        Sala.capacidadMax = capacidadMax;
    }
}
