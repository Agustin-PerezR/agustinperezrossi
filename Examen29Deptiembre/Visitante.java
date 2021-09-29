package com.company.Examen29Deptiembre;

public class Visitante {
    private  int id;
    private int asiento;

    public Visitante(int id, int asiento) {
        this.id = id;
        this.asiento = asiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
