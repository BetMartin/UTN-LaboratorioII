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
    int matricula;
    Avion vuela;

    public Piloto(String Nombre, int dni,int matricula, Avion vuelta) {
        super(Nombre, dni);
        this.matricula = matricula;
        this.vuela = vuelta;
    }
    
    public void vuela(){
        System.out.println("Volando...");
        
    }
    
    
    
    
}
