/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.luislopez.model;

/**
 *
 * @author informatica
 */
public class Televisor extends Dispositivo{
    
    private String tamanopantalla;
    
    public Televisor(){
        
    }

    public Televisor(String tamanopantalla) {
        this.tamanopantalla = tamanopantalla;
    }

    public String getTamanopantalla() {
        return tamanopantalla;
    }

    public void setTamanopantalla(String tamanopantalla) {
        this.tamanopantalla = tamanopantalla;
    }
    
    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    public void encender(int volumen) {
        System.out.println("Televisor encendido con volumen");
    }    
}
