package com.company.IntegradorTarjeta;

import java.util.ArrayList;

class sistemaTarjetaEquis {
    public static void main(String[] args) {
        float precio = 0;
        String hora = "";
        String fecha = "";
        Viaje viaje= new Viaje(precio, hora, fecha);
        viaje.setPrecio(10);

        float saldo= 0;
        float saldoNegativoMaximo= 0;
        int numeroId = 0;
        ArrayList<Viaje> viajes = new ArrayList<>();
        viajes.add(viaje);
        TarjetaEquis tarjeta= new TarjetaEquis(saldo, saldoNegativoMaximo,numeroId, viajes);
        tarjeta.setSaldo(10.5f);
        tarjeta.setSaldoNegativoMaximo(-100);

        String nombre="";
        String apellido="";
        Pasajero pasajero= new Pasajero(nombre,apellido,tarjeta);

        ArrayList<Pasajero> pasajerosPresentes=new ArrayList<>();
        ArrayList<Pasajero> historialDePasajeros = new ArrayList<>();
        String linea = "";
        Sistema sistema = new Sistema(pasajerosPresentes,historialDePasajeros,linea);
        sistema.subePasajero(pasajero);
        sistema.pasajerosQueSeHanSubidoAlgunaVez();
        sistema.pasajerosConUltimoMontoAbonado(pasajero);
        float monto= 2;
        tarjeta.cargarSube(monto);
        sistema.seSuperaElSaldoNegativo(pasajero);
        tarjeta.ultimoMontoAbonado();
    }
}