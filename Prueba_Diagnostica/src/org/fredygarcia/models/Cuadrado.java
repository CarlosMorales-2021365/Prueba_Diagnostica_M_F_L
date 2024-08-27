package org.fredygarcia.models;

/**
 *
 * @author alexa
 */
public class Cuadrado extends Forma{
    double lado;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
