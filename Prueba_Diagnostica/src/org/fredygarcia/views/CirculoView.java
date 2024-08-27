package org.fredygarcia.views;

import java.util.Scanner;
import org.fredygarcia.controllers.CalcularArea_Circulo;
import org.fredygarcia.models.Circulo;

/**
 *
 * @author alexa
 */
public class CirculoView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);
        
        CalcularArea_Circulo controladorCirculo = new CalcularArea_Circulo(circulo);

        double area = controladorCirculo.calcularArea();
        
        System.out.println("El área del círculo es: " + area);
        
    }
}

