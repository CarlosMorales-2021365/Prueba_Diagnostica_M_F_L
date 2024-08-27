package org.fredygarcia.controllers;

import org.fredygarcia.models.Circulo;

/**
 *
 * @author alexa
 */
public class CalcularArea_Circulo {
    private Circulo circulo;

    public CalcularArea_Circulo(Circulo circulo) {
        this.circulo = circulo;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(circulo.getRadio(), 2);
    }
}
