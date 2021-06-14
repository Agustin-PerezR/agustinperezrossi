package com.company.Areas;
import java.util.ArrayList;
import static java.lang.Math.PI;
import static java.lang.Math.*;
public class Area {
private float lado;
private float radio;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    static double getAreaCirculo(float radio){
    double areaCirculo = 0;
    areaCirculo= PI * radio *radio;
        System.out.println(areaCirculo);
    return  areaCirculo;
    }
    static double getAreaEsfera(float radio){
        double areaEsfera = 0;
        areaEsfera= 4 * PI * radio *radio;
        System.out.println(areaEsfera);
        return  areaEsfera;
    }
    static double getAreaCuadrado(float lado){
        double area = 0;
        area= lado*lado;
        System.out.println(area);
        return area;
    }
    static double getAreaCubo(float lado){
        double area = 0;
        area= 6*lado*lado;
        System.out.println(area);
        return area;
    }
    static double getAreaTriamgulo(float base, float altura){
        double area = 0;
        area= base*altura/2;
        System.out.println(area);
        return area;
    }

}
