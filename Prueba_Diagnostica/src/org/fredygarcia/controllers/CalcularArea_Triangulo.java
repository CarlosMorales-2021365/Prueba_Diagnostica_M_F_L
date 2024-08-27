package org.fredygarcia.controllers;

import org.fredygarcia.models.Triangulo;

/**
 *
 * @author alexa
 */
public class CalcularArea_Triangulo {
    private Triangulo triangulo;

    public CalcularArea_Triangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public double calcularArea() {
        return (triangulo.getBase() * triangulo.getAltura()) / 2;
    }

}
