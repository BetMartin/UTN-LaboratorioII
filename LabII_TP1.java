/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LabII_TP1;

import java.util.ArrayList;

/**
 *
 * @author betsa
 */
public class LabII_TP1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Creación de Reserva
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        reservas.add(new Reserva(52,null));
        reservas.add (new Reserva(53,null));

        System.out.println("Reservas cargadas \nCantidad de reservas: " + reservas.size()+"\n----------------------------------");
        
        Flota flota = new Flota();
        
        //Creación de pilotos
        Piloto[] pilotos = new Piloto[2];
        pilotos[0] = new Piloto("Jorge",32156155,8778,null); 
        pilotos[1] = new Piloto("Juan",32151541,8956,null);

        //Mostramos los pilotos
        System.out.println("Nombre del piloto: " + pilotos[0].getNombre()+" | DNI: " + pilotos[0].getDni() + " | Matricula: " + pilotos[0].getMatricula());
        System.out.println("Nombre del piloto: " + pilotos[1].getNombre()+" | DNI: " + pilotos[1].getDni() + " | Matricula: " + pilotos[1].getMatricula()+"\n----------------------------------");

        Vuelo vuelo = new Vuelo(123,null,reservas);
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        vuelos.add(vuelo);
        System.out.println("Se agregaron las reservas al vuelo\nid:" + vuelo.getId()+"\n----------------------------------");


        reservas.get(0).v = vuelo;
        reservas.get(1).v = vuelo;

                
        Avion avion = new Avion(120000,vuelos, flota, pilotos);
        vuelo.pertenece = avion;
        pilotos[0].vuelta =avion;
        pilotos[1].vuelta =avion;
        System.out.println("Se asigno el avion al piloto\n---------------------------");

        pilotos[0].vuela();
    }
    
}
