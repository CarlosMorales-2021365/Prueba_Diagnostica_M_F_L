package org.fredygarcia.models;

/**
 *
 * @author alexa
 */
public class Circulo extends Forma {
    double radio;

    public Circulo() {
        super();
    }
    
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
}

