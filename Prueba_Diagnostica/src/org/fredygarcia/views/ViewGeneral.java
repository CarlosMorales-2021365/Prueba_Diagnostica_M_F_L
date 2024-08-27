package org.fredygarcia.views;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class ViewGeneral {
    public void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la figura para calcular el área:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    CirculoView vistaCirculo = new CirculoView();
                    vistaCirculo.mostrarMenu();
                    break;
                case 2:
                    CuadradoView vistaCuadrado = new CuadradoView();
                    vistaCuadrado.mostrarMenu();
                    break;
                case 3:
                    RectanguloView vistaRectangulo = new RectanguloView();
                    vistaRectangulo.mostrarMenu();
                    break;
                case 4:
                    TrianguloView vistaTriangulo = new TrianguloView();
                    vistaTriangulo.mostrarMenu();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }

            System.out.println();
        }
    }
}

