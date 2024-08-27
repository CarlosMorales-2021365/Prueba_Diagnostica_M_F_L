package org.fredygarcia.views;

import java.util.Scanner;
import org.fredygarcia.controllers.CalcularArea_Cuadrado;
import org.fredygarcia.models.Cuadrado;

/**
 *
 * @author alexa
 */
public class CuadradoView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cuadrado:");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);
        
        CalcularArea_Cuadrado controladorCuadrado = new CalcularArea_Cuadrado(cuadrado);

        double area = controladorCuadrado.calcularArea();

        System.out.println("El área del cuadrado es: " + area);
        
        scanner.close();
    }
}
