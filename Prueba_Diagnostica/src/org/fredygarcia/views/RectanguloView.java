package org.fredygarcia.views;

import java.util.Scanner;
import org.fredygarcia.controllers.CalcularArea_Rectangulo;
import org.fredygarcia.models.Rectangulo;

/**
 *
 * @author alexa
 */
public class RectanguloView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        
        CalcularArea_Rectangulo controladorRectangulo = new CalcularArea_Rectangulo(rectangulo);

        double area = controladorRectangulo.calcularArea();
        
        System.out.println("El área del rectángulo es: " + area);
        
        scanner.close();
    }
}
