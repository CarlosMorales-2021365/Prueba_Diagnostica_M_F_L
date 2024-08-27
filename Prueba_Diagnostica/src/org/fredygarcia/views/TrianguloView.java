package org.fredygarcia.views;

import java.util.Scanner;
import org.fredygarcia.controllers.CalcularArea_Triangulo;
import org.fredygarcia.models.Triangulo;

/**
 *
 * @author alexa
 */
public class TrianguloView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        CalcularArea_Triangulo controladorTriangulo = new CalcularArea_Triangulo(triangulo);

        double area = controladorTriangulo.calcularArea();

        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
