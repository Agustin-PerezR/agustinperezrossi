package com.company;

import java.util.HashMap;

public  class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public HashMap<Integer,Float> productosRefrigeranteConCapacidad(){
        /** que retorna un map cuyas claves son los códigos de los productos
         refrigerantes que tienen una capacidad mayor o igual a 300 lts y son de
         origen argentino.
         **/
        HashMap<Integer,Float> productos= new HashMap<>();
        Integer codigo;
        if(getOrigen()=="Argentina" && litrosDeCapacidad >= 300 ){
            codigo= getCodigo();
            productos.put(codigo, litrosDeCapacidad);
        }
        return productos;
    }
    @Override
    public String tipoDeProducto() {
        return "ProductoDeRefrigeracion";
    }
    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }

    public void setLitrosDeCapacidad(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }
}
