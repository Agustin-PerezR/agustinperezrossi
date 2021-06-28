package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	String nombre="";
	int dni= 0;
	int cbu= 0;
    Cliente cliente= new Cliente(nombre,dni,cbu);
    cliente.setNombre("Carlos");
    cliente.setDni(123456);
    cliente.setCbu(3214);
    ArrayList<Cliente> clientes = new ArrayList<>();
    clientes.add(cliente);
    Banco banco= new Banco(nombre, clientes);
    banco.setNombre("Banco Nacion");
    banco.setClientes(clientes);
    banco.cbusDeClientesVisitantes(clientes);
    banco.imprimirCbu(banco.cbusDeClientesVisitantes(clientes));
    banco.cantidadDeVisitasPorCliente(clientes);
	}
}
