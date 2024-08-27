package org.fredygarcia.controllers;

import org.fredygarcia.models.Cuadrado;

/**
 *
 * @author alexa
 */
public class CalcularArea_Cuadrado {
    private Cuadrado cuadrado;

    public CalcularArea_Cuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    public double calcularArea() {
        return Math.pow(cuadrado.getLado(), 2);
    }
}

