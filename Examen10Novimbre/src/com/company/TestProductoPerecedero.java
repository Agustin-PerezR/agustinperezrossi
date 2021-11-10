package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestProductoPerecedero {
    @Test
    public void calcularPrecioFinal(){
        PruductoPerecedero p= new PruductoPerecedero();
        float costo = 30;
        float precioFinal= costo + 300 -(costo*(30/100));
        assertTrue(costo> p.getCosto());
    }
}
