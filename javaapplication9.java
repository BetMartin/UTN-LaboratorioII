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
        
        Flota flota = new Flota();
        
        //Creación de pilotos
        Piloto[] pilotos = new Piloto[2];
        pilotos[0] = new Piloto("Jorge",32156155,8778,null); 
        pilotos[1] = new Piloto("Juan",32151541,8956,null);
        
        Vuelo vuelo = new Vuelo(123,null,reservas);
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        vuelos.add(vuelo);
        
        reservas.get(0).v = vuelo;
        reservas.get(1).v = vuelo;
      
                
        Avion avion = new Avion(120000,vuelos, flota, pilotos);
        vuelo.pertenece = avion;
        pilotos[0].vuela =avion;
        pilotos[1].vuela =avion;
        
        pilotos[0].vuela();
    }
    
}
