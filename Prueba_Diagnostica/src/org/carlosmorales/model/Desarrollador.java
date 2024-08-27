/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosmorales.model;

/**
 *
 * @author Usuario
 */
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProgramacion) {
        
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return "lenguaje de programacion " + lenguajeProgramacion+ 
                "\n" + super.toString();
    }

    @Override
    void trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

            
    
}
