/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabII_TP1;


public class Reserva {
    public int numeroReserva;
    public Vuelo v;

    public Reserva(int numeroReserva, Vuelo v) {
        this.numeroReserva = numeroReserva;
        this.v = v;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }
}
