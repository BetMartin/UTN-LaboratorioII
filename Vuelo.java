/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabII_TP1;

import java.util.ArrayList;

/**
 *
 * @author betsa
 */
public class Vuelo {
    public int id;
    public Avion pertenece;
    public ArrayList<Reserva> reserva;

    public Vuelo(int id, Avion pertenece, ArrayList<Reserva> reserva) {
        this.id = id;
        this.pertenece = pertenece;
        this.reserva = reserva;
    }  
}
