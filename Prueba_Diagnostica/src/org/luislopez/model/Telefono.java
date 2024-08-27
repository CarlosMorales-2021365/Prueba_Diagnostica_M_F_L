
package org.luislopez.model;

/**
 *
 * @author informatica
 */
public class Telefono extends Dispositivo{
    private String tipo;
    
    
    public Telefono(){
        
    }

    public Telefono(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void encender() {
        System.out.println("Telefono encendido");
    }

    public void encender(String codigo) {
        System.out.println("Telefono encendido con código");
    }

    
}
