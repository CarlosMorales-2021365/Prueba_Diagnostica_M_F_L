
package org.luislopez.model;

/**
 *
 * @author informatica
 */
public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private int anio;
    
    public Dispositivo(){
        
    }

    public Dispositivo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    public abstract void encender();
    
    public void encender(int voltaje){
        System.out.println("Encendido ._.");
    }
    
    
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }        
    
    
    
}
