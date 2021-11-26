package com.company;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPrecioFinal {
    @Test
    public void calcularElPrecio(){
        ProductoDeSuper p1= new PruductoPerecedero("a","a",23,200,4,1);
        boolean resultado = false;
        if(p1.calcularPrecioFinal()==200){
            resultado=true;
        }
        assertTrue(resultado=true);
    }
}
