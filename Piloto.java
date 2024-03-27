/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabII_TP1;

/**
 *
 * @author betsa
 */
public class Piloto extends Persona implements Volador{
    public int matricula;
    public Avion vuelta;

    public Piloto(String Nombre, int dni,int matricula, Avion vuelta) {
        super(Nombre, dni);
        this.matricula = matricula;
        this.vuelta = vuelta;
    }
    
    public void vuela(){
        System.out.println("Volando...");
        
    }

    //get y set

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Avion getVuelta() {
        return vuelta;
    }

    public void setVuelta(Avion vuelta) {
        this.vuelta = vuelta;
    }


}
