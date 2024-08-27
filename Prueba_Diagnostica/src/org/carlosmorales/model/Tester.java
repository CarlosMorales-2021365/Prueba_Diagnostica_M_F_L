/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosmorales.model;

/**
 *
 * @author Usuario
 */
public class Tester extends Empleado {
    String tipoPrueba;

    public Tester() {
    }

    public Tester(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public Tester(String tipoPrueba, String nombre, String edad, double salario) {
        super(nombre, edad, salario);
        this.tipoPrueba = tipoPrueba;
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
    
    
    
    @Override
    void trabajar() {
        System.out.println(nombre+"realizo la prueba de:"+ tipoPrueba);
    }
    
    public void trabajar(String herramienta,String proyecto){
        System.out.println(nombre+" ejecuto la prueba "+tipoPrueba+" con la herramienta "+herramienta+" en el proyecto "+proyecto);
    }
    
}
