package org.fredygarcia.controllers;

import org.fredygarcia.models.Rectangulo;

/**
 *
 * @author alexa
 */
public class CalcularArea_Rectangulo {
    private Rectangulo rectangulo;

    public CalcularArea_Rectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    public double calcularArea() {
        return rectangulo.getBase() * rectangulo.getAltura();
    }

}

