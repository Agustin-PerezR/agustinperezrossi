package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper {
    private int  cantDiasParaVencerse;
    private static int DESCUENTO = 30;

    @Override
    public float calcularGananciaObtenida() {
        if (cantDiasParaVencerse <= 90){
            return 10;
        }
        else {
            return 25;
        }
    }
    @Override
    public float calcularPrecioFinal(){
        float costo = getCosto();
        float precioFinal= costo + calcularGananciaObtenida() -(costo*(DESCUENTO/100));
        return precioFinal;
    }


    @Override
    public String tipoDeProducto() {
        return "ProductoAlimenticio";
    }

    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public void setCantDiasParaVencerse(int cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public static int getDESCUENTO() {
        return DESCUENTO;
    }

    public static void setDESCUENTO(int DESCUENTO) {
        ProductoAlimenticio.DESCUENTO = DESCUENTO;
    }
}
