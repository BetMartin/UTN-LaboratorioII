/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabII_TP1;

import java.util.ArrayList;


public class Avion {
    public int autonomia;
    public ArrayList<Vuelo>vuelo;
    public Flota flota;
    public Piloto piloto[];

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
