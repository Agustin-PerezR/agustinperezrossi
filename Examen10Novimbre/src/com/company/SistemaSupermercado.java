package com.company;

import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public  class SistemaSupermercado implements SistemaDeVentas {

    private String nombre;
    private HashSet<ProductoDeSuper> productosDisponibles;
    private ArrayList<ProductoDeSuper> productosVendidos;

    @Override
    public float gananciaTotalObtenida() {
        return 0;
    }

    @Override
    public float ingresosTotales() {
        return 0;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return 0;
    }
    public void elegirProd(String tipo,String nombre, String origen, int codigo, float costo){
        if(tipo == "Electrico"){
            Scanner ingresoGarantia = new Scanner(System.in);
            int cantDiasDeGarantia = ingresoGarantia.nextInt();

            Scanner ingresoTipo2 = new Scanner(System.in);
            String tipo2 = ingresoTipo2.nextLine();

            if(tipo2 == "Calefaccion"){
                Scanner ingresoWatts = new Scanner(System.in);
                int wattsDePotenciaMax = ingresoWatts.nextInt();

                ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion(nombre,origen,
                        codigo,costo,cantDiasDeGarantia,wattsDePotenciaMax);
                productosVendidos.add(productoDeCalefaccion);
            }
            else if(tipo2 == "Refrigeracion"){
                Scanner ingresoLitros = new Scanner(System.in);
                float litrosDeCapacidad = ingresoLitros.nextFloat();

                ProductoDeRefrigeracion productoDeRefrigeracion = new ProductoDeRefrigeracion(nombre,origen,
                        codigo,costo,cantDiasDeGarantia,litrosDeCapacidad);
                productosVendidos.add(productoDeRefrigeracion);
            }
        }
        else if(tipo == "Alimenticio"){
            Scanner ingresoVencer = new Scanner(System.in);
            int cantDiasParaVencerse = ingresoVencer.nextInt();

            Scanner ingresoTipo2 = new Scanner(System.in);
            String tipo2 = ingresoTipo2.nextLine();
            if(tipo2 == "Perecedero"){
                Scanner ingresoTemp = new Scanner(System.in);
                float temperaturaMinimaDeFrio = ingresoTemp.nextFloat();

                PruductoPerecedero productoPerecedero = new PruductoPerecedero(nombre,origen,
                        codigo,costo,cantDiasParaVencerse,temperaturaMinimaDeFrio);
                productosVendidos.add(productoPerecedero);
            }
            else if(tipo2 == "No perecedero"){
                Scanner ingresoSodio = new Scanner(System.in);
                float mgDeSodio = ingresoSodio.nextFloat();

                ProductoNoPerecedero productoNoPecedero = new ProductoNoPerecedero(nombre,origen,
                        codigo,costo,cantDiasParaVencerse,mgDeSodio);
                productosVendidos.add(productoNoPecedero);
            }
        }
    }

    public void agregarProductoVendido() throws InputMismatchException{

        Scanner ingresoNombre = new Scanner(System.in);
        String nombre = ingresoNombre.nextLine();

        Scanner ingresoOrigen = new Scanner(System.in);
        String origen = ingresoOrigen.nextLine();

        Scanner ingresoCodigo = new Scanner(System.in);
        int codigo = ingresoCodigo.nextInt();

        Scanner ingresoCosto = new Scanner(System.in);
        float costo = ingresoCosto.nextFloat();

        Scanner ingresoTipo = new Scanner(System.in);
        String tipo = ingresoTipo.nextLine();
         elegirProd(tipo,nombre,origen,codigo,costo);

        throw new InputMismatchException();
    }
    public static void serializar(SistemaSupermercado sistemaSupermercado)throws IOException,JsonProcessingException{
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String,Object> mapASerializar = new HashMap<>();
            mapASerializar.put("superMercado",sistemaSupermercado);
            String objetoJson1 = mapper.writeValueAsString(mapASerializar);
            System.out.println(objetoJson1);
            File archivo = new File("src/com/company/sistemaSuper.json");
            mapper.writeValue(archivo,mapASerializar);
    }
    public static void deserializar(SistemaSupermercado sistemaSupermercado)throws IOException,JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        String json1 = "{}";
        HashMap map1 = mapper.readValue(json1,HashMap.class);

    }
}






