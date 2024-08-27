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
    String lenguajeProgramacion;

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
    void trabajar() {
        System.out.println(nombre+"esta usando"+ lenguajeProgramacion+"para su proyecto");
    }

    
    public void trabajar(String proyecto){
        System.out.println(nombre+"esta usando"+ lenguajeProgramacion+"para el proyecto"+proyecto);
    }

            
    
}
