package com.company.IntegradorTarjeta;

import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float saldoNegativoMaximo;
    private int numeroId;
    private ArrayList<Viaje>viajes;

    public TarjetaEquis(float saldo, float saldoNegativoMaximo,
                        int numeroId, ArrayList<Viaje> viajes) {
        this.saldo = saldo;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.numeroId = numeroId;
        this.viajes = viajes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }

    public void setSaldoNegativoMaximo(float saldoNegativoMaximo) {
        this.saldoNegativoMaximo = saldoNegativoMaximo;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    public float cargarSube (float monto){
        this.saldo= saldo + monto;
        System.out.println(saldo);
        return saldo;
    }
    public void  realizarViaje(Viaje viaje){
        viajes.add(viaje);
    }
    public float ultimoMontoAbonado() {
        float ultimoMonto = 0;
        for (Viaje aux : viajes) {
            int i = 1;
            if (viajes.size() == i) {
                ultimoMonto = aux.getPrecio();
            }
            i = i + 1;
        }
        System.out.println(ultimoMonto);
            return ultimoMonto;


    }
}
