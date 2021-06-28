package com.company;

public class Cliente extends Persona{
    private  int cbu;
    public Cliente(String nombre, int dni,int cbu) {
        super(nombre, dni);
        this.cbu=cbu;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
}
