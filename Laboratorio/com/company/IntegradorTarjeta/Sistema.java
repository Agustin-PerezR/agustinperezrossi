package com.company.IntegradorTarjeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialDePasajeros;
    private String linea;

    public Sistema(ArrayList<Pasajero> pasajerosPresentes,
                   ArrayList<Pasajero> historialDePasajeros, String linea) {
        this.pasajerosPresentes = pasajerosPresentes;
        this.historialDePasajeros = historialDePasajeros;
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    public  void subePasajero(Pasajero pasajero){
    float saldo= pasajero.getTarjeta().getSaldo();
    float saldoNegativoMax= pasajero.getTarjeta().getSaldoNegativoMaximo();
    int numeroId= pasajero.getTarjeta().getNumeroId();
    ArrayList<Viaje> viajes= pasajero.getTarjeta().getViajes();
        float precio=0;
        for (Viaje aux :viajes
             ) {
           precio= aux.getPrecio();

        }
    if(precio  <= saldo && saldo >= saldoNegativoMax){
        System.out.println("Bienvenido");
        saldo= saldo- precio;
        pasajero.getTarjeta().setSaldo(saldo);
        pasajerosPresentes.add(pasajero);
        historialDePasajeros.add(pasajero);
    }
    else{
        System.out.println(saldo);
        System.out.println(saldoNegativoMax);
        System.out.println("Saldo Insuficiente");
    }
    }
    public void bajarPasajero(Pasajero pasajero){
        while (pasajerosPresentes.size()>0){
            pasajerosPresentes.remove(pasajero);
            break;
        }
        System.out.println(pasajerosPresentes.size());
    }
    public HashSet<Pasajero>pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero> histPasajeros = new HashSet<>();
        histPasajeros.addAll(historialDePasajeros);
        return histPasajeros;
    }
    public HashMap<Pasajero,Float > pasajerosConUltimoMontoAbonado(Pasajero pasajero){
        HashMap<Pasajero, Float> ultimoMontoPasajero= new HashMap<>();
        ArrayList<Viaje> viajes= new ArrayList<>();
        viajes= pasajero.getTarjeta().getViajes();
        float precio= 0;
        for (Viaje aux :viajes) {
            int i=1;
            if(viajes.size()==i){
                precio= aux.getPrecio();
                ultimoMontoPasajero.put(pasajero, precio);
            }
            i= i+1;
        }
        System.out.println(precio);
        return ultimoMontoPasajero;
    }
     public float ultimoMontoAbonadoPorPasajero(float numeroId){
        float monto = 0.f;
        HashMap<Pasajero, Float> pasajerosMonto = pasajerosConUltimoMontoAbonado();

        for (Map.Entry<Pasajero, Float> aux : pasajerosMonto.entrySet()){
            Pasajero pasajero = aux.getKey();
            if (pasajero.getTarjeta().getNumeronld() == numeroId){
                monto = aux.getValue();
                break;
            }
        }

        return monto;
    }
    public  boolean seSuperaElSaldoNegativo(Pasajero pasajero){
        boolean seSupera=true;
        if (pasajero.getTarjeta().getSaldo()< pasajero.getTarjeta().getSaldoNegativoMaximo()){
            seSupera=true;
            System.out.println("Se supera");
        }
        else {
            seSupera= false;
            System.out.println("No se supera");

        }
        return seSupera;
    }
}
