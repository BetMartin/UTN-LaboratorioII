/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabII_TP1;

/**
 *
 * @author betsa
 */
public class Persona {
    protected String Nombre;
    protected int dni;

    public Persona(String Nombre, int dni) {
        this.Nombre = Nombre;
        this.dni = dni;
    }
    
    //Get y set


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
