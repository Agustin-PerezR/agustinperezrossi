package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper{
    private int cantDiasDeGarantia;
    private static int RECARGO_POR_ENVIO = 50;

    public ProductoElectrico(String nombre, String origen, int codigo, float cost, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, cost);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    @Override
    public float calcularGananciaObtenida(){
        float porcentaje= 0;
        if(cantDiasDeGarantia == 365){
            porcentaje= 45;
        }
        else if ((cantDiasDeGarantia <=60)){
            porcentaje = 15;
        }
        return porcentaje;
    }
    @Override
    public float calcularPrecioFinal(){
        float costo = getCost();
        float precioFinal= costo + calcularGananciaObtenida() +(costo*(RECARGO_POR_ENVIO/100));
        return precioFinal;
    }

    @Override
    public String tipoDeProducto() {
        return "ProductoElectrico";
    }
    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static int getRecargoPorEnvio() {
        return RECARGO_POR_ENVIO;
    }

    public static void setRecargoPorEnvio(int recargoPorEnvio) {
        RECARGO_POR_ENVIO = recargoPorEnvio;
    }
}
