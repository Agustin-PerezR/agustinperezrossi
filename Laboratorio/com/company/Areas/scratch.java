package com.company.Areas;

class Scratch {
    public static void main(String[] args) {
        Area area= new Area();
        float radio = 2;
        float lado= 4;
        float base = 3;
        float altura = 4;
        area.setLado(lado);
        area.setRadio(radio);
        area.getAreaCirculo(radio);
        area.getAreaEsfera(radio);
        area.getAreaCuadrado(lado);
        area.getAreaCubo(lado);
        area.getAreaTriamgulo(base,altura);

    }
}