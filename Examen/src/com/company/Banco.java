package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashSet<Integer> cbusDeClientesVisitantes(ArrayList<Cliente> clientes) {
        HashSet<Integer> cbuCliente = new HashSet<>();
        for (Cliente aux : clientes) {
            int cbu = aux.getCbu();
            cbuCliente.add(cbu);
        }
        return cbuCliente;
    }

    public void imprimirCbu(HashSet<Integer> cbuCliente) {
        for (int aux:cbuCliente) {
            System.out.println(cbuCliente);
        }
    }
    public HashMap<Integer,Integer> cantidadDeVisitasPorCliente(ArrayList<Cliente>clientes){
        HashMap<Integer,Integer>visitas=new HashMap<>();
        int veces= 0;
        int cbu= 0;
        for (Cliente aux:clientes) {
            if(visitas.containsKey(aux.getCbu()) ){
                cbu= aux.getCbu();
                visitas.put(cbu, 0);
            }
            else {
                veces= veces+ 1;
            }


        }
        System.out.println(visitas);
        return visitas;
    }
   public void imprimirVisitas(HashMap<Integer, Integer> visitas){
        for (int i = 0; i <visitas.size() ; i++) {
            System.out.println("Clave:"+ visitas.get(i)+ "Values: "+ visitas.values() );
        }
    }

}
