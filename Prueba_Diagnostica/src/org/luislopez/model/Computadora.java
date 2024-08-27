/*
 */
package org.luislopez.model;

/**
 *
 * @author informatica
 */
public class Computadora extends Dispositivo{
    private String sistemaoperativo;
    
    public Computadora(){
        
    }

    public Computadora(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }
    
    @Override
    public void encender() {
        System.out.println("Computadora encendida");
    }

    public void encender(String clave) {
        System.out.println("Computadora encendida con clave");
    }
    
}
