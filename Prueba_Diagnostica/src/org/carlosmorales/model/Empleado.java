/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosmorales.model;

/**
 *
 * @author Usuario
 */
abstract class Empleado {
    String nombre;
    String edad;
    double salario;


    public Empleado() {
    }

    public Empleado(String nombre, String edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


     
    
    abstract void trabajar();
    
    
    
    public void trabajar(int horas){
        System.out.println("El total de horas trabajadas es: "+horas);
    }
    
    
    @Override
    public String toString(){
        return "{"+"\n"+
                "nombre: "+nombre+", "+"\n"+
                "edad: "+edad+", "+"\n"+
                "salario: "+salario+"\n"+
                "}";
    }
}


