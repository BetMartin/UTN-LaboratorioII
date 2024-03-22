/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

import java.util.ArrayList;

/**
 *
 * @author betsa
 */
public class Avion {
    private int autonomia;
    private ArrayList<Vuelo>vuelo;
    private Flota flota;
    private Piloto piloto[];

    public Avion(int autonomia, ArrayList<Vuelo> vuelo, Flota flota, Piloto[] piloto) {
        this.autonomia = autonomia;
        this.vuelo = vuelo;
        this.flota = flota;
        this.piloto = piloto;
    }
 
    public void setAutonimia(int autonomia){
     this.autonomia= autonomia;   
    }
    public int getAutonomia(){
        return autonomia;
    }
}
